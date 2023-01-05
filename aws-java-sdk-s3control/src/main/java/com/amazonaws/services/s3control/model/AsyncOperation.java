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
 * A container for the information about an asynchronous operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/AsyncOperation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AsyncOperation implements Serializable, Cloneable {

    /**
     * <p>
     * The time that the request was sent to the service.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The specific operation for the asynchronous request.
     * </p>
     */
    private String operation;
    /**
     * <p>
     * The request token associated with the request.
     * </p>
     */
    private String requestTokenARN;
    /**
     * <p>
     * The parameters associated with the request.
     * </p>
     */
    private AsyncRequestParameters requestParameters;
    /**
     * <p>
     * The current status of the request.
     * </p>
     */
    private String requestStatus;
    /**
     * <p>
     * The details of the response.
     * </p>
     */
    private AsyncResponseDetails responseDetails;

    /**
     * <p>
     * The time that the request was sent to the service.
     * </p>
     * 
     * @param creationTime
     *        The time that the request was sent to the service.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time that the request was sent to the service.
     * </p>
     * 
     * @return The time that the request was sent to the service.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time that the request was sent to the service.
     * </p>
     * 
     * @param creationTime
     *        The time that the request was sent to the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncOperation withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The specific operation for the asynchronous request.
     * </p>
     * 
     * @param operation
     *        The specific operation for the asynchronous request.
     * @see AsyncOperationName
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The specific operation for the asynchronous request.
     * </p>
     * 
     * @return The specific operation for the asynchronous request.
     * @see AsyncOperationName
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The specific operation for the asynchronous request.
     * </p>
     * 
     * @param operation
     *        The specific operation for the asynchronous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AsyncOperationName
     */

    public AsyncOperation withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * The specific operation for the asynchronous request.
     * </p>
     * 
     * @param operation
     *        The specific operation for the asynchronous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AsyncOperationName
     */

    public AsyncOperation withOperation(AsyncOperationName operation) {
        this.operation = operation.toString();
        return this;
    }

    /**
     * <p>
     * The request token associated with the request.
     * </p>
     * 
     * @param requestTokenARN
     *        The request token associated with the request.
     */

    public void setRequestTokenARN(String requestTokenARN) {
        this.requestTokenARN = requestTokenARN;
    }

    /**
     * <p>
     * The request token associated with the request.
     * </p>
     * 
     * @return The request token associated with the request.
     */

    public String getRequestTokenARN() {
        return this.requestTokenARN;
    }

    /**
     * <p>
     * The request token associated with the request.
     * </p>
     * 
     * @param requestTokenARN
     *        The request token associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncOperation withRequestTokenARN(String requestTokenARN) {
        setRequestTokenARN(requestTokenARN);
        return this;
    }

    /**
     * <p>
     * The parameters associated with the request.
     * </p>
     * 
     * @param requestParameters
     *        The parameters associated with the request.
     */

    public void setRequestParameters(AsyncRequestParameters requestParameters) {
        this.requestParameters = requestParameters;
    }

    /**
     * <p>
     * The parameters associated with the request.
     * </p>
     * 
     * @return The parameters associated with the request.
     */

    public AsyncRequestParameters getRequestParameters() {
        return this.requestParameters;
    }

    /**
     * <p>
     * The parameters associated with the request.
     * </p>
     * 
     * @param requestParameters
     *        The parameters associated with the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncOperation withRequestParameters(AsyncRequestParameters requestParameters) {
        setRequestParameters(requestParameters);
        return this;
    }

    /**
     * <p>
     * The current status of the request.
     * </p>
     * 
     * @param requestStatus
     *        The current status of the request.
     */

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    /**
     * <p>
     * The current status of the request.
     * </p>
     * 
     * @return The current status of the request.
     */

    public String getRequestStatus() {
        return this.requestStatus;
    }

    /**
     * <p>
     * The current status of the request.
     * </p>
     * 
     * @param requestStatus
     *        The current status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncOperation withRequestStatus(String requestStatus) {
        setRequestStatus(requestStatus);
        return this;
    }

    /**
     * <p>
     * The details of the response.
     * </p>
     * 
     * @param responseDetails
     *        The details of the response.
     */

    public void setResponseDetails(AsyncResponseDetails responseDetails) {
        this.responseDetails = responseDetails;
    }

    /**
     * <p>
     * The details of the response.
     * </p>
     * 
     * @return The details of the response.
     */

    public AsyncResponseDetails getResponseDetails() {
        return this.responseDetails;
    }

    /**
     * <p>
     * The details of the response.
     * </p>
     * 
     * @param responseDetails
     *        The details of the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AsyncOperation withResponseDetails(AsyncResponseDetails responseDetails) {
        setResponseDetails(responseDetails);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getRequestTokenARN() != null)
            sb.append("RequestTokenARN: ").append(getRequestTokenARN()).append(",");
        if (getRequestParameters() != null)
            sb.append("RequestParameters: ").append(getRequestParameters()).append(",");
        if (getRequestStatus() != null)
            sb.append("RequestStatus: ").append(getRequestStatus()).append(",");
        if (getResponseDetails() != null)
            sb.append("ResponseDetails: ").append(getResponseDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AsyncOperation == false)
            return false;
        AsyncOperation other = (AsyncOperation) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getRequestTokenARN() == null ^ this.getRequestTokenARN() == null)
            return false;
        if (other.getRequestTokenARN() != null && other.getRequestTokenARN().equals(this.getRequestTokenARN()) == false)
            return false;
        if (other.getRequestParameters() == null ^ this.getRequestParameters() == null)
            return false;
        if (other.getRequestParameters() != null && other.getRequestParameters().equals(this.getRequestParameters()) == false)
            return false;
        if (other.getRequestStatus() == null ^ this.getRequestStatus() == null)
            return false;
        if (other.getRequestStatus() != null && other.getRequestStatus().equals(this.getRequestStatus()) == false)
            return false;
        if (other.getResponseDetails() == null ^ this.getResponseDetails() == null)
            return false;
        if (other.getResponseDetails() != null && other.getResponseDetails().equals(this.getResponseDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getRequestTokenARN() == null) ? 0 : getRequestTokenARN().hashCode());
        hashCode = prime * hashCode + ((getRequestParameters() == null) ? 0 : getRequestParameters().hashCode());
        hashCode = prime * hashCode + ((getRequestStatus() == null) ? 0 : getRequestStatus().hashCode());
        hashCode = prime * hashCode + ((getResponseDetails() == null) ? 0 : getResponseDetails().hashCode());
        return hashCode;
    }

    @Override
    public AsyncOperation clone() {
        try {
            return (AsyncOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
