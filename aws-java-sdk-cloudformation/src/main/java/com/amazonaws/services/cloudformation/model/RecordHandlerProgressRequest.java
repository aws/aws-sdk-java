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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/RecordHandlerProgress"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecordHandlerProgressRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     */
    private String bearerToken;
    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     */
    private String operationStatus;
    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     */
    private String currentOperationStatus;
    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     */
    private String resourceModel;
    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @param bearerToken
     *        Reserved for use by the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *        >CloudFormation CLI</a>.
     */

    public void setBearerToken(String bearerToken) {
        this.bearerToken = bearerToken;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @return Reserved for use by the <a
     *         href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *         >CloudFormation CLI</a>.
     */

    public String getBearerToken() {
        return this.bearerToken;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @param bearerToken
     *        Reserved for use by the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *        >CloudFormation CLI</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordHandlerProgressRequest withBearerToken(String bearerToken) {
        setBearerToken(bearerToken);
        return this;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @param operationStatus
     *        Reserved for use by the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *        >CloudFormation CLI</a>.
     * @see OperationStatus
     */

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @return Reserved for use by the <a
     *         href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *         >CloudFormation CLI</a>.
     * @see OperationStatus
     */

    public String getOperationStatus() {
        return this.operationStatus;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @param operationStatus
     *        Reserved for use by the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *        >CloudFormation CLI</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public RecordHandlerProgressRequest withOperationStatus(String operationStatus) {
        setOperationStatus(operationStatus);
        return this;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @param operationStatus
     *        Reserved for use by the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *        >CloudFormation CLI</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public RecordHandlerProgressRequest withOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @param currentOperationStatus
     *        Reserved for use by the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *        >CloudFormation CLI</a>.
     * @see OperationStatus
     */

    public void setCurrentOperationStatus(String currentOperationStatus) {
        this.currentOperationStatus = currentOperationStatus;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @return Reserved for use by the <a
     *         href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *         >CloudFormation CLI</a>.
     * @see OperationStatus
     */

    public String getCurrentOperationStatus() {
        return this.currentOperationStatus;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @param currentOperationStatus
     *        Reserved for use by the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *        >CloudFormation CLI</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public RecordHandlerProgressRequest withCurrentOperationStatus(String currentOperationStatus) {
        setCurrentOperationStatus(currentOperationStatus);
        return this;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @param currentOperationStatus
     *        Reserved for use by the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *        >CloudFormation CLI</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public RecordHandlerProgressRequest withCurrentOperationStatus(OperationStatus currentOperationStatus) {
        this.currentOperationStatus = currentOperationStatus.toString();
        return this;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @param statusMessage
     *        Reserved for use by the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *        >CloudFormation CLI</a>.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @return Reserved for use by the <a
     *         href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *         >CloudFormation CLI</a>.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @param statusMessage
     *        Reserved for use by the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *        >CloudFormation CLI</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordHandlerProgressRequest withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @param errorCode
     *        Reserved for use by the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *        >CloudFormation CLI</a>.
     * @see HandlerErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @return Reserved for use by the <a
     *         href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *         >CloudFormation CLI</a>.
     * @see HandlerErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @param errorCode
     *        Reserved for use by the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *        >CloudFormation CLI</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HandlerErrorCode
     */

    public RecordHandlerProgressRequest withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @param errorCode
     *        Reserved for use by the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *        >CloudFormation CLI</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HandlerErrorCode
     */

    public RecordHandlerProgressRequest withErrorCode(HandlerErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @param resourceModel
     *        Reserved for use by the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *        >CloudFormation CLI</a>.
     */

    public void setResourceModel(String resourceModel) {
        this.resourceModel = resourceModel;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @return Reserved for use by the <a
     *         href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *         >CloudFormation CLI</a>.
     */

    public String getResourceModel() {
        return this.resourceModel;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @param resourceModel
     *        Reserved for use by the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *        >CloudFormation CLI</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordHandlerProgressRequest withResourceModel(String resourceModel) {
        setResourceModel(resourceModel);
        return this;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @param clientRequestToken
     *        Reserved for use by the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *        >CloudFormation CLI</a>.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @return Reserved for use by the <a
     *         href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *         >CloudFormation CLI</a>.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * Reserved for use by the <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     * >CloudFormation CLI</a>.
     * </p>
     * 
     * @param clientRequestToken
     *        Reserved for use by the <a
     *        href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/what-is-cloudformation-cli.html"
     *        >CloudFormation CLI</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecordHandlerProgressRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getBearerToken() != null)
            sb.append("BearerToken: ").append(getBearerToken()).append(",");
        if (getOperationStatus() != null)
            sb.append("OperationStatus: ").append(getOperationStatus()).append(",");
        if (getCurrentOperationStatus() != null)
            sb.append("CurrentOperationStatus: ").append(getCurrentOperationStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getResourceModel() != null)
            sb.append("ResourceModel: ").append(getResourceModel()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append(getClientRequestToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecordHandlerProgressRequest == false)
            return false;
        RecordHandlerProgressRequest other = (RecordHandlerProgressRequest) obj;
        if (other.getBearerToken() == null ^ this.getBearerToken() == null)
            return false;
        if (other.getBearerToken() != null && other.getBearerToken().equals(this.getBearerToken()) == false)
            return false;
        if (other.getOperationStatus() == null ^ this.getOperationStatus() == null)
            return false;
        if (other.getOperationStatus() != null && other.getOperationStatus().equals(this.getOperationStatus()) == false)
            return false;
        if (other.getCurrentOperationStatus() == null ^ this.getCurrentOperationStatus() == null)
            return false;
        if (other.getCurrentOperationStatus() != null && other.getCurrentOperationStatus().equals(this.getCurrentOperationStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getResourceModel() == null ^ this.getResourceModel() == null)
            return false;
        if (other.getResourceModel() != null && other.getResourceModel().equals(this.getResourceModel()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBearerToken() == null) ? 0 : getBearerToken().hashCode());
        hashCode = prime * hashCode + ((getOperationStatus() == null) ? 0 : getOperationStatus().hashCode());
        hashCode = prime * hashCode + ((getCurrentOperationStatus() == null) ? 0 : getCurrentOperationStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getResourceModel() == null) ? 0 : getResourceModel().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public RecordHandlerProgressRequest clone() {
        return (RecordHandlerProgressRequest) super.clone();
    }

}
