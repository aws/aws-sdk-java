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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the current status of a resource operation request. For more information, see <a
 * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-manage-requests.html">Managing
 * resource operation requests</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/ProgressEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProgressEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the resource type used in the operation.
     * </p>
     */
    private String typeName;
    /**
     * <p>
     * The primary identifier for the resource.
     * </p>
     * <note>
     * <p>
     * In some cases, the resource identifier may be available before the resource operation has reached a status of
     * <code>SUCCESS</code>.
     * </p>
     * </note>
     */
    private String identifier;
    /**
     * <p>
     * The unique token representing this resource operation request.
     * </p>
     * <p>
     * Use the <code>RequestToken</code> with <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html"
     * >GetResourceRequestStatus</a> to return the current status of a resource operation request.
     * </p>
     */
    private String requestToken;
    /**
     * <p>
     * The resource operation type.
     * </p>
     */
    private String operation;
    /**
     * <p>
     * The current status of the resource operation request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>: The resource operation hasn't yet started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The resource operation is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code>: The resource operation has successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The resource operation has failed. Refer to the error code and status message for more
     * information.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_IN_PROGRESS</code>: The resource operation is in the process of being canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_COMPLETE</code>: The resource operation has been canceled.
     * </p>
     * </li>
     * </ul>
     */
    private String operationStatus;
    /**
     * <p>
     * When the resource operation request was initiated.
     * </p>
     */
    private java.util.Date eventTime;
    /**
     * <p>
     * A JSON string containing the resource model, consisting of each resource property and its current value.
     * </p>
     */
    private String resourceModel;
    /**
     * <p>
     * Any message explaining the current status.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * For requests with a status of <code>FAILED</code>, the associated error code.
     * </p>
     * <p>
     * For error code definitions, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-test-contract-errors.html"
     * >Handler error codes</a> in the <i>CloudFormation Command Line Interface User Guide for Extension
     * Development</i>.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * When to next request the status of this resource operation request.
     * </p>
     */
    private java.util.Date retryAfter;

    /**
     * <p>
     * The name of the resource type used in the operation.
     * </p>
     * 
     * @param typeName
     *        The name of the resource type used in the operation.
     */

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * <p>
     * The name of the resource type used in the operation.
     * </p>
     * 
     * @return The name of the resource type used in the operation.
     */

    public String getTypeName() {
        return this.typeName;
    }

    /**
     * <p>
     * The name of the resource type used in the operation.
     * </p>
     * 
     * @param typeName
     *        The name of the resource type used in the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProgressEvent withTypeName(String typeName) {
        setTypeName(typeName);
        return this;
    }

    /**
     * <p>
     * The primary identifier for the resource.
     * </p>
     * <note>
     * <p>
     * In some cases, the resource identifier may be available before the resource operation has reached a status of
     * <code>SUCCESS</code>.
     * </p>
     * </note>
     * 
     * @param identifier
     *        The primary identifier for the resource.</p> <note>
     *        <p>
     *        In some cases, the resource identifier may be available before the resource operation has reached a status
     *        of <code>SUCCESS</code>.
     *        </p>
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * The primary identifier for the resource.
     * </p>
     * <note>
     * <p>
     * In some cases, the resource identifier may be available before the resource operation has reached a status of
     * <code>SUCCESS</code>.
     * </p>
     * </note>
     * 
     * @return The primary identifier for the resource.</p> <note>
     *         <p>
     *         In some cases, the resource identifier may be available before the resource operation has reached a
     *         status of <code>SUCCESS</code>.
     *         </p>
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * The primary identifier for the resource.
     * </p>
     * <note>
     * <p>
     * In some cases, the resource identifier may be available before the resource operation has reached a status of
     * <code>SUCCESS</code>.
     * </p>
     * </note>
     * 
     * @param identifier
     *        The primary identifier for the resource.</p> <note>
     *        <p>
     *        In some cases, the resource identifier may be available before the resource operation has reached a status
     *        of <code>SUCCESS</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProgressEvent withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * The unique token representing this resource operation request.
     * </p>
     * <p>
     * Use the <code>RequestToken</code> with <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html"
     * >GetResourceRequestStatus</a> to return the current status of a resource operation request.
     * </p>
     * 
     * @param requestToken
     *        The unique token representing this resource operation request.</p>
     *        <p>
     *        Use the <code>RequestToken</code> with <a
     *        href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html"
     *        >GetResourceRequestStatus</a> to return the current status of a resource operation request.
     */

    public void setRequestToken(String requestToken) {
        this.requestToken = requestToken;
    }

    /**
     * <p>
     * The unique token representing this resource operation request.
     * </p>
     * <p>
     * Use the <code>RequestToken</code> with <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html"
     * >GetResourceRequestStatus</a> to return the current status of a resource operation request.
     * </p>
     * 
     * @return The unique token representing this resource operation request.</p>
     *         <p>
     *         Use the <code>RequestToken</code> with <a
     *         href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html"
     *         >GetResourceRequestStatus</a> to return the current status of a resource operation request.
     */

    public String getRequestToken() {
        return this.requestToken;
    }

    /**
     * <p>
     * The unique token representing this resource operation request.
     * </p>
     * <p>
     * Use the <code>RequestToken</code> with <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html"
     * >GetResourceRequestStatus</a> to return the current status of a resource operation request.
     * </p>
     * 
     * @param requestToken
     *        The unique token representing this resource operation request.</p>
     *        <p>
     *        Use the <code>RequestToken</code> with <a
     *        href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html"
     *        >GetResourceRequestStatus</a> to return the current status of a resource operation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProgressEvent withRequestToken(String requestToken) {
        setRequestToken(requestToken);
        return this;
    }

    /**
     * <p>
     * The resource operation type.
     * </p>
     * 
     * @param operation
     *        The resource operation type.
     * @see Operation
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * The resource operation type.
     * </p>
     * 
     * @return The resource operation type.
     * @see Operation
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * The resource operation type.
     * </p>
     * 
     * @param operation
     *        The resource operation type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operation
     */

    public ProgressEvent withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * The resource operation type.
     * </p>
     * 
     * @param operation
     *        The resource operation type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Operation
     */

    public ProgressEvent withOperation(Operation operation) {
        this.operation = operation.toString();
        return this;
    }

    /**
     * <p>
     * The current status of the resource operation request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>: The resource operation hasn't yet started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The resource operation is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code>: The resource operation has successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The resource operation has failed. Refer to the error code and status message for more
     * information.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_IN_PROGRESS</code>: The resource operation is in the process of being canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_COMPLETE</code>: The resource operation has been canceled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operationStatus
     *        The current status of the resource operation request.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code>: The resource operation hasn't yet started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The resource operation is currently in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code>: The resource operation has successfully completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The resource operation has failed. Refer to the error code and status message for
     *        more information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCEL_IN_PROGRESS</code>: The resource operation is in the process of being canceled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCEL_COMPLETE</code>: The resource operation has been canceled.
     *        </p>
     *        </li>
     * @see OperationStatus
     */

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    /**
     * <p>
     * The current status of the resource operation request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>: The resource operation hasn't yet started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The resource operation is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code>: The resource operation has successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The resource operation has failed. Refer to the error code and status message for more
     * information.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_IN_PROGRESS</code>: The resource operation is in the process of being canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_COMPLETE</code>: The resource operation has been canceled.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The current status of the resource operation request.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PENDING</code>: The resource operation hasn't yet started.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code>: The resource operation is currently in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCESS</code>: The resource operation has successfully completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The resource operation has failed. Refer to the error code and status message for
     *         more information.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCEL_IN_PROGRESS</code>: The resource operation is in the process of being canceled.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANCEL_COMPLETE</code>: The resource operation has been canceled.
     *         </p>
     *         </li>
     * @see OperationStatus
     */

    public String getOperationStatus() {
        return this.operationStatus;
    }

    /**
     * <p>
     * The current status of the resource operation request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>: The resource operation hasn't yet started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The resource operation is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code>: The resource operation has successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The resource operation has failed. Refer to the error code and status message for more
     * information.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_IN_PROGRESS</code>: The resource operation is in the process of being canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_COMPLETE</code>: The resource operation has been canceled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operationStatus
     *        The current status of the resource operation request.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code>: The resource operation hasn't yet started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The resource operation is currently in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code>: The resource operation has successfully completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The resource operation has failed. Refer to the error code and status message for
     *        more information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCEL_IN_PROGRESS</code>: The resource operation is in the process of being canceled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCEL_COMPLETE</code>: The resource operation has been canceled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public ProgressEvent withOperationStatus(String operationStatus) {
        setOperationStatus(operationStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the resource operation request.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PENDING</code>: The resource operation hasn't yet started.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The resource operation is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCESS</code>: The resource operation has successfully completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The resource operation has failed. Refer to the error code and status message for more
     * information.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_IN_PROGRESS</code>: The resource operation is in the process of being canceled.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANCEL_COMPLETE</code>: The resource operation has been canceled.
     * </p>
     * </li>
     * </ul>
     * 
     * @param operationStatus
     *        The current status of the resource operation request.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PENDING</code>: The resource operation hasn't yet started.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The resource operation is currently in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCESS</code>: The resource operation has successfully completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The resource operation has failed. Refer to the error code and status message for
     *        more information.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCEL_IN_PROGRESS</code>: The resource operation is in the process of being canceled.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANCEL_COMPLETE</code>: The resource operation has been canceled.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public ProgressEvent withOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus.toString();
        return this;
    }

    /**
     * <p>
     * When the resource operation request was initiated.
     * </p>
     * 
     * @param eventTime
     *        When the resource operation request was initiated.
     */

    public void setEventTime(java.util.Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * <p>
     * When the resource operation request was initiated.
     * </p>
     * 
     * @return When the resource operation request was initiated.
     */

    public java.util.Date getEventTime() {
        return this.eventTime;
    }

    /**
     * <p>
     * When the resource operation request was initiated.
     * </p>
     * 
     * @param eventTime
     *        When the resource operation request was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProgressEvent withEventTime(java.util.Date eventTime) {
        setEventTime(eventTime);
        return this;
    }

    /**
     * <p>
     * A JSON string containing the resource model, consisting of each resource property and its current value.
     * </p>
     * 
     * @param resourceModel
     *        A JSON string containing the resource model, consisting of each resource property and its current value.
     */

    public void setResourceModel(String resourceModel) {
        this.resourceModel = resourceModel;
    }

    /**
     * <p>
     * A JSON string containing the resource model, consisting of each resource property and its current value.
     * </p>
     * 
     * @return A JSON string containing the resource model, consisting of each resource property and its current value.
     */

    public String getResourceModel() {
        return this.resourceModel;
    }

    /**
     * <p>
     * A JSON string containing the resource model, consisting of each resource property and its current value.
     * </p>
     * 
     * @param resourceModel
     *        A JSON string containing the resource model, consisting of each resource property and its current value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProgressEvent withResourceModel(String resourceModel) {
        setResourceModel(resourceModel);
        return this;
    }

    /**
     * <p>
     * Any message explaining the current status.
     * </p>
     * 
     * @param statusMessage
     *        Any message explaining the current status.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Any message explaining the current status.
     * </p>
     * 
     * @return Any message explaining the current status.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Any message explaining the current status.
     * </p>
     * 
     * @param statusMessage
     *        Any message explaining the current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProgressEvent withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * For requests with a status of <code>FAILED</code>, the associated error code.
     * </p>
     * <p>
     * For error code definitions, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-test-contract-errors.html"
     * >Handler error codes</a> in the <i>CloudFormation Command Line Interface User Guide for Extension
     * Development</i>.
     * </p>
     * 
     * @param errorCode
     *        For requests with a status of <code>FAILED</code>, the associated error code.</p>
     *        <p>
     *        For error code definitions, see <a href=
     *        "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-test-contract-errors.html"
     *        >Handler error codes</a> in the <i>CloudFormation Command Line Interface User Guide for Extension
     *        Development</i>.
     * @see HandlerErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * For requests with a status of <code>FAILED</code>, the associated error code.
     * </p>
     * <p>
     * For error code definitions, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-test-contract-errors.html"
     * >Handler error codes</a> in the <i>CloudFormation Command Line Interface User Guide for Extension
     * Development</i>.
     * </p>
     * 
     * @return For requests with a status of <code>FAILED</code>, the associated error code.</p>
     *         <p>
     *         For error code definitions, see <a href=
     *         "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-test-contract-errors.html"
     *         >Handler error codes</a> in the <i>CloudFormation Command Line Interface User Guide for Extension
     *         Development</i>.
     * @see HandlerErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * For requests with a status of <code>FAILED</code>, the associated error code.
     * </p>
     * <p>
     * For error code definitions, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-test-contract-errors.html"
     * >Handler error codes</a> in the <i>CloudFormation Command Line Interface User Guide for Extension
     * Development</i>.
     * </p>
     * 
     * @param errorCode
     *        For requests with a status of <code>FAILED</code>, the associated error code.</p>
     *        <p>
     *        For error code definitions, see <a href=
     *        "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-test-contract-errors.html"
     *        >Handler error codes</a> in the <i>CloudFormation Command Line Interface User Guide for Extension
     *        Development</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HandlerErrorCode
     */

    public ProgressEvent withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * For requests with a status of <code>FAILED</code>, the associated error code.
     * </p>
     * <p>
     * For error code definitions, see <a
     * href="https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-test-contract-errors.html"
     * >Handler error codes</a> in the <i>CloudFormation Command Line Interface User Guide for Extension
     * Development</i>.
     * </p>
     * 
     * @param errorCode
     *        For requests with a status of <code>FAILED</code>, the associated error code.</p>
     *        <p>
     *        For error code definitions, see <a href=
     *        "https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/resource-type-test-contract-errors.html"
     *        >Handler error codes</a> in the <i>CloudFormation Command Line Interface User Guide for Extension
     *        Development</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HandlerErrorCode
     */

    public ProgressEvent withErrorCode(HandlerErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * When to next request the status of this resource operation request.
     * </p>
     * 
     * @param retryAfter
     *        When to next request the status of this resource operation request.
     */

    public void setRetryAfter(java.util.Date retryAfter) {
        this.retryAfter = retryAfter;
    }

    /**
     * <p>
     * When to next request the status of this resource operation request.
     * </p>
     * 
     * @return When to next request the status of this resource operation request.
     */

    public java.util.Date getRetryAfter() {
        return this.retryAfter;
    }

    /**
     * <p>
     * When to next request the status of this resource operation request.
     * </p>
     * 
     * @param retryAfter
     *        When to next request the status of this resource operation request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProgressEvent withRetryAfter(java.util.Date retryAfter) {
        setRetryAfter(retryAfter);
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
        if (getTypeName() != null)
            sb.append("TypeName: ").append(getTypeName()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getRequestToken() != null)
            sb.append("RequestToken: ").append(getRequestToken()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getOperationStatus() != null)
            sb.append("OperationStatus: ").append(getOperationStatus()).append(",");
        if (getEventTime() != null)
            sb.append("EventTime: ").append(getEventTime()).append(",");
        if (getResourceModel() != null)
            sb.append("ResourceModel: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getRetryAfter() != null)
            sb.append("RetryAfter: ").append(getRetryAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProgressEvent == false)
            return false;
        ProgressEvent other = (ProgressEvent) obj;
        if (other.getTypeName() == null ^ this.getTypeName() == null)
            return false;
        if (other.getTypeName() != null && other.getTypeName().equals(this.getTypeName()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getRequestToken() == null ^ this.getRequestToken() == null)
            return false;
        if (other.getRequestToken() != null && other.getRequestToken().equals(this.getRequestToken()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getOperationStatus() == null ^ this.getOperationStatus() == null)
            return false;
        if (other.getOperationStatus() != null && other.getOperationStatus().equals(this.getOperationStatus()) == false)
            return false;
        if (other.getEventTime() == null ^ this.getEventTime() == null)
            return false;
        if (other.getEventTime() != null && other.getEventTime().equals(this.getEventTime()) == false)
            return false;
        if (other.getResourceModel() == null ^ this.getResourceModel() == null)
            return false;
        if (other.getResourceModel() != null && other.getResourceModel().equals(this.getResourceModel()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getRetryAfter() == null ^ this.getRetryAfter() == null)
            return false;
        if (other.getRetryAfter() != null && other.getRetryAfter().equals(this.getRetryAfter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getRequestToken() == null) ? 0 : getRequestToken().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getOperationStatus() == null) ? 0 : getOperationStatus().hashCode());
        hashCode = prime * hashCode + ((getEventTime() == null) ? 0 : getEventTime().hashCode());
        hashCode = prime * hashCode + ((getResourceModel() == null) ? 0 : getResourceModel().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getRetryAfter() == null) ? 0 : getRetryAfter().hashCode());
        return hashCode;
    }

    @Override
    public ProgressEvent clone() {
        try {
            return (ProgressEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudcontrolapi.model.transform.ProgressEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
