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
package com.amazonaws.services.servicediscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type that contains information about a specified operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicediscovery-2017-03-14/Operation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Operation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the operation that you want to get information about.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the operation that is associated with the specified ID.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The status of the operation. Values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SUBMITTED</b>: This is the initial state immediately after you submit a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b>: AWS Cloud Map is performing the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAIL</b>: The operation failed. For the failure reason, see <code>ErrorMessage</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * If the value of <code>Status</code> is <code>FAIL</code>, the reason that the operation failed.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The code associated with <code>ErrorMessage</code>. Values for <code>ErrorCode</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANNOT_CREATE_HOSTED_ZONE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED_TOKEN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOSTED_ZONE_NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_FAILURE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CHANGE_BATCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THROTTLED_REQUEST</code>
     * </p>
     * </li>
     * </ul>
     */
    private String errorCode;
    /**
     * <p>
     * The date and time that the request was submitted, in Unix date/time format and Coordinated Universal Time (UTC).
     * The value of <code>CreateDate</code> is accurate to milliseconds. For example, the value
     * <code>1516925490.087</code> represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date createDate;
    /**
     * <p>
     * The date and time that the value of <code>Status</code> changed to the current value, in Unix date/time format
     * and Coordinated Universal Time (UTC). The value of <code>UpdateDate</code> is accurate to milliseconds. For
     * example, the value <code>1516925490.087</code> represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date updateDate;
    /**
     * <p>
     * The name of the target entity that is associated with the operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE</b>: The namespace ID is returned in the <code>ResourceId</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE</b>: The service ID is returned in the <code>ResourceId</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INSTANCE</b>: The instance ID is returned in the <code>ResourceId</code> property.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> targets;

    /**
     * <p>
     * The ID of the operation that you want to get information about.
     * </p>
     * 
     * @param id
     *        The ID of the operation that you want to get information about.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the operation that you want to get information about.
     * </p>
     * 
     * @return The ID of the operation that you want to get information about.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the operation that you want to get information about.
     * </p>
     * 
     * @param id
     *        The ID of the operation that you want to get information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the operation that is associated with the specified ID.
     * </p>
     * 
     * @param type
     *        The name of the operation that is associated with the specified ID.
     * @see OperationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The name of the operation that is associated with the specified ID.
     * </p>
     * 
     * @return The name of the operation that is associated with the specified ID.
     * @see OperationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The name of the operation that is associated with the specified ID.
     * </p>
     * 
     * @param type
     *        The name of the operation that is associated with the specified ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public Operation withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The name of the operation that is associated with the specified ID.
     * </p>
     * 
     * @param type
     *        The name of the operation that is associated with the specified ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationType
     */

    public Operation withType(OperationType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The status of the operation. Values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SUBMITTED</b>: This is the initial state immediately after you submit a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b>: AWS Cloud Map is performing the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAIL</b>: The operation failed. For the failure reason, see <code>ErrorMessage</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the operation. Values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>SUBMITTED</b>: This is the initial state immediately after you submit a request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PENDING</b>: AWS Cloud Map is performing the operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SUCCESS</b>: The operation succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FAIL</b>: The operation failed. For the failure reason, see <code>ErrorMessage</code>.
     *        </p>
     *        </li>
     * @see OperationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the operation. Values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SUBMITTED</b>: This is the initial state immediately after you submit a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b>: AWS Cloud Map is performing the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAIL</b>: The operation failed. For the failure reason, see <code>ErrorMessage</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the operation. Values include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>SUBMITTED</b>: This is the initial state immediately after you submit a request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>PENDING</b>: AWS Cloud Map is performing the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SUCCESS</b>: The operation succeeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FAIL</b>: The operation failed. For the failure reason, see <code>ErrorMessage</code>.
     *         </p>
     *         </li>
     * @see OperationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the operation. Values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SUBMITTED</b>: This is the initial state immediately after you submit a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b>: AWS Cloud Map is performing the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAIL</b>: The operation failed. For the failure reason, see <code>ErrorMessage</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the operation. Values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>SUBMITTED</b>: This is the initial state immediately after you submit a request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PENDING</b>: AWS Cloud Map is performing the operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SUCCESS</b>: The operation succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FAIL</b>: The operation failed. For the failure reason, see <code>ErrorMessage</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public Operation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the operation. Values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>SUBMITTED</b>: This is the initial state immediately after you submit a request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>PENDING</b>: AWS Cloud Map is performing the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SUCCESS</b>: The operation succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FAIL</b>: The operation failed. For the failure reason, see <code>ErrorMessage</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the operation. Values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>SUBMITTED</b>: This is the initial state immediately after you submit a request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>PENDING</b>: AWS Cloud Map is performing the operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SUCCESS</b>: The operation succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FAIL</b>: The operation failed. For the failure reason, see <code>ErrorMessage</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperationStatus
     */

    public Operation withStatus(OperationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * If the value of <code>Status</code> is <code>FAIL</code>, the reason that the operation failed.
     * </p>
     * 
     * @param errorMessage
     *        If the value of <code>Status</code> is <code>FAIL</code>, the reason that the operation failed.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * If the value of <code>Status</code> is <code>FAIL</code>, the reason that the operation failed.
     * </p>
     * 
     * @return If the value of <code>Status</code> is <code>FAIL</code>, the reason that the operation failed.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * If the value of <code>Status</code> is <code>FAIL</code>, the reason that the operation failed.
     * </p>
     * 
     * @param errorMessage
     *        If the value of <code>Status</code> is <code>FAIL</code>, the reason that the operation failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The code associated with <code>ErrorMessage</code>. Values for <code>ErrorCode</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANNOT_CREATE_HOSTED_ZONE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED_TOKEN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOSTED_ZONE_NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_FAILURE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CHANGE_BATCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THROTTLED_REQUEST</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorCode
     *        The code associated with <code>ErrorMessage</code>. Values for <code>ErrorCode</code> include the
     *        following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACCESS_DENIED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANNOT_CREATE_HOSTED_ZONE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPIRED_TOKEN</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HOSTED_ZONE_NOT_FOUND</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTERNAL_FAILURE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID_CHANGE_BATCH</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>THROTTLED_REQUEST</code>
     *        </p>
     *        </li>
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The code associated with <code>ErrorMessage</code>. Values for <code>ErrorCode</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANNOT_CREATE_HOSTED_ZONE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED_TOKEN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOSTED_ZONE_NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_FAILURE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CHANGE_BATCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THROTTLED_REQUEST</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The code associated with <code>ErrorMessage</code>. Values for <code>ErrorCode</code> include the
     *         following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACCESS_DENIED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CANNOT_CREATE_HOSTED_ZONE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EXPIRED_TOKEN</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HOSTED_ZONE_NOT_FOUND</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INTERNAL_FAILURE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INVALID_CHANGE_BATCH</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>THROTTLED_REQUEST</code>
     *         </p>
     *         </li>
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The code associated with <code>ErrorMessage</code>. Values for <code>ErrorCode</code> include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACCESS_DENIED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CANNOT_CREATE_HOSTED_ZONE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED_TOKEN</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOSTED_ZONE_NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INTERNAL_FAILURE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CHANGE_BATCH</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THROTTLED_REQUEST</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param errorCode
     *        The code associated with <code>ErrorMessage</code>. Values for <code>ErrorCode</code> include the
     *        following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACCESS_DENIED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CANNOT_CREATE_HOSTED_ZONE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPIRED_TOKEN</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HOSTED_ZONE_NOT_FOUND</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INTERNAL_FAILURE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID_CHANGE_BATCH</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>THROTTLED_REQUEST</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The date and time that the request was submitted, in Unix date/time format and Coordinated Universal Time (UTC).
     * The value of <code>CreateDate</code> is accurate to milliseconds. For example, the value
     * <code>1516925490.087</code> represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param createDate
     *        The date and time that the request was submitted, in Unix date/time format and Coordinated Universal Time
     *        (UTC). The value of <code>CreateDate</code> is accurate to milliseconds. For example, the value
     *        <code>1516925490.087</code> represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    /**
     * <p>
     * The date and time that the request was submitted, in Unix date/time format and Coordinated Universal Time (UTC).
     * The value of <code>CreateDate</code> is accurate to milliseconds. For example, the value
     * <code>1516925490.087</code> represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that the request was submitted, in Unix date/time format and Coordinated Universal Time
     *         (UTC). The value of <code>CreateDate</code> is accurate to milliseconds. For example, the value
     *         <code>1516925490.087</code> represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getCreateDate() {
        return this.createDate;
    }

    /**
     * <p>
     * The date and time that the request was submitted, in Unix date/time format and Coordinated Universal Time (UTC).
     * The value of <code>CreateDate</code> is accurate to milliseconds. For example, the value
     * <code>1516925490.087</code> represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param createDate
     *        The date and time that the request was submitted, in Unix date/time format and Coordinated Universal Time
     *        (UTC). The value of <code>CreateDate</code> is accurate to milliseconds. For example, the value
     *        <code>1516925490.087</code> represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withCreateDate(java.util.Date createDate) {
        setCreateDate(createDate);
        return this;
    }

    /**
     * <p>
     * The date and time that the value of <code>Status</code> changed to the current value, in Unix date/time format
     * and Coordinated Universal Time (UTC). The value of <code>UpdateDate</code> is accurate to milliseconds. For
     * example, the value <code>1516925490.087</code> represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param updateDate
     *        The date and time that the value of <code>Status</code> changed to the current value, in Unix date/time
     *        format and Coordinated Universal Time (UTC). The value of <code>UpdateDate</code> is accurate to
     *        milliseconds. For example, the value <code>1516925490.087</code> represents Friday, January 26, 2018
     *        12:11:30.087 AM.
     */

    public void setUpdateDate(java.util.Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * <p>
     * The date and time that the value of <code>Status</code> changed to the current value, in Unix date/time format
     * and Coordinated Universal Time (UTC). The value of <code>UpdateDate</code> is accurate to milliseconds. For
     * example, the value <code>1516925490.087</code> represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that the value of <code>Status</code> changed to the current value, in Unix date/time
     *         format and Coordinated Universal Time (UTC). The value of <code>UpdateDate</code> is accurate to
     *         milliseconds. For example, the value <code>1516925490.087</code> represents Friday, January 26, 2018
     *         12:11:30.087 AM.
     */

    public java.util.Date getUpdateDate() {
        return this.updateDate;
    }

    /**
     * <p>
     * The date and time that the value of <code>Status</code> changed to the current value, in Unix date/time format
     * and Coordinated Universal Time (UTC). The value of <code>UpdateDate</code> is accurate to milliseconds. For
     * example, the value <code>1516925490.087</code> represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param updateDate
     *        The date and time that the value of <code>Status</code> changed to the current value, in Unix date/time
     *        format and Coordinated Universal Time (UTC). The value of <code>UpdateDate</code> is accurate to
     *        milliseconds. For example, the value <code>1516925490.087</code> represents Friday, January 26, 2018
     *        12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withUpdateDate(java.util.Date updateDate) {
        setUpdateDate(updateDate);
        return this;
    }

    /**
     * <p>
     * The name of the target entity that is associated with the operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE</b>: The namespace ID is returned in the <code>ResourceId</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE</b>: The service ID is returned in the <code>ResourceId</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INSTANCE</b>: The instance ID is returned in the <code>ResourceId</code> property.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the target entity that is associated with the operation:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>NAMESPACE</b>: The namespace ID is returned in the <code>ResourceId</code> property.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SERVICE</b>: The service ID is returned in the <code>ResourceId</code> property.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>INSTANCE</b>: The instance ID is returned in the <code>ResourceId</code> property.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getTargets() {
        return targets;
    }

    /**
     * <p>
     * The name of the target entity that is associated with the operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE</b>: The namespace ID is returned in the <code>ResourceId</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE</b>: The service ID is returned in the <code>ResourceId</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INSTANCE</b>: The instance ID is returned in the <code>ResourceId</code> property.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targets
     *        The name of the target entity that is associated with the operation:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NAMESPACE</b>: The namespace ID is returned in the <code>ResourceId</code> property.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SERVICE</b>: The service ID is returned in the <code>ResourceId</code> property.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>INSTANCE</b>: The instance ID is returned in the <code>ResourceId</code> property.
     *        </p>
     *        </li>
     */

    public void setTargets(java.util.Map<String, String> targets) {
        this.targets = targets;
    }

    /**
     * <p>
     * The name of the target entity that is associated with the operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NAMESPACE</b>: The namespace ID is returned in the <code>ResourceId</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SERVICE</b>: The service ID is returned in the <code>ResourceId</code> property.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>INSTANCE</b>: The instance ID is returned in the <code>ResourceId</code> property.
     * </p>
     * </li>
     * </ul>
     * 
     * @param targets
     *        The name of the target entity that is associated with the operation:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NAMESPACE</b>: The namespace ID is returned in the <code>ResourceId</code> property.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SERVICE</b>: The service ID is returned in the <code>ResourceId</code> property.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>INSTANCE</b>: The instance ID is returned in the <code>ResourceId</code> property.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation withTargets(java.util.Map<String, String> targets) {
        setTargets(targets);
        return this;
    }

    public Operation addTargetsEntry(String key, String value) {
        if (null == this.targets) {
            this.targets = new java.util.HashMap<String, String>();
        }
        if (this.targets.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.targets.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Targets.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Operation clearTargetsEntries() {
        this.targets = null;
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getCreateDate() != null)
            sb.append("CreateDate: ").append(getCreateDate()).append(",");
        if (getUpdateDate() != null)
            sb.append("UpdateDate: ").append(getUpdateDate()).append(",");
        if (getTargets() != null)
            sb.append("Targets: ").append(getTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Operation == false)
            return false;
        Operation other = (Operation) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getCreateDate() == null ^ this.getCreateDate() == null)
            return false;
        if (other.getCreateDate() != null && other.getCreateDate().equals(this.getCreateDate()) == false)
            return false;
        if (other.getUpdateDate() == null ^ this.getUpdateDate() == null)
            return false;
        if (other.getUpdateDate() != null && other.getUpdateDate().equals(this.getUpdateDate()) == false)
            return false;
        if (other.getTargets() == null ^ this.getTargets() == null)
            return false;
        if (other.getTargets() != null && other.getTargets().equals(this.getTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        hashCode = prime * hashCode + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        hashCode = prime * hashCode + ((getTargets() == null) ? 0 : getTargets().hashCode());
        return hashCode;
    }

    @Override
    public Operation clone() {
        try {
            return (Operation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.servicediscovery.model.transform.OperationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
