/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appfabric.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about a user's access to an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/UserAccessResultItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserAccessResultItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String app;
    /**
     * <p>
     * The ID of the application tenant.
     * </p>
     */
    private String tenantId;
    /**
     * <p>
     * The display name of the tenant.
     * </p>
     */
    private String tenantDisplayName;
    /**
     * <p>
     * The unique ID of the task.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * The status of the user access result item.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The user access task is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The user access task completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The user access task failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code>: The user access task expired.
     * </p>
     * </li>
     * </ul>
     */
    private String resultStatus;
    /**
     * <p>
     * The email address of the target user.
     * </p>
     */
    private String email;
    /**
     * <p>
     * The unique ID of user.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The full name of the user.
     * </p>
     */
    private String userFullName;
    /**
     * <p>
     * The first name of the user.
     * </p>
     */
    private String userFirstName;
    /**
     * <p>
     * The last name of the user.
     * </p>
     */
    private String userLastName;
    /**
     * <p>
     * The status of the user returned by the application.
     * </p>
     */
    private String userStatus;
    /**
     * <p>
     * Contains information about an error returned from a user access task.
     * </p>
     */
    private TaskError taskError;

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param app
     *        The name of the application.
     */

    public void setApp(String app) {
        this.app = app;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getApp() {
        return this.app;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param app
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAccessResultItem withApp(String app) {
        setApp(app);
        return this;
    }

    /**
     * <p>
     * The ID of the application tenant.
     * </p>
     * 
     * @param tenantId
     *        The ID of the application tenant.
     */

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * <p>
     * The ID of the application tenant.
     * </p>
     * 
     * @return The ID of the application tenant.
     */

    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * <p>
     * The ID of the application tenant.
     * </p>
     * 
     * @param tenantId
     *        The ID of the application tenant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAccessResultItem withTenantId(String tenantId) {
        setTenantId(tenantId);
        return this;
    }

    /**
     * <p>
     * The display name of the tenant.
     * </p>
     * 
     * @param tenantDisplayName
     *        The display name of the tenant.
     */

    public void setTenantDisplayName(String tenantDisplayName) {
        this.tenantDisplayName = tenantDisplayName;
    }

    /**
     * <p>
     * The display name of the tenant.
     * </p>
     * 
     * @return The display name of the tenant.
     */

    public String getTenantDisplayName() {
        return this.tenantDisplayName;
    }

    /**
     * <p>
     * The display name of the tenant.
     * </p>
     * 
     * @param tenantDisplayName
     *        The display name of the tenant.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAccessResultItem withTenantDisplayName(String tenantDisplayName) {
        setTenantDisplayName(tenantDisplayName);
        return this;
    }

    /**
     * <p>
     * The unique ID of the task.
     * </p>
     * 
     * @param taskId
     *        The unique ID of the task.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The unique ID of the task.
     * </p>
     * 
     * @return The unique ID of the task.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The unique ID of the task.
     * </p>
     * 
     * @param taskId
     *        The unique ID of the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAccessResultItem withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * The status of the user access result item.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The user access task is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The user access task completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The user access task failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code>: The user access task expired.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resultStatus
     *        The status of the user access result item.</p>
     *        <p>
     *        The following states are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The user access task is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code>: The user access task completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The user access task failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPIRED</code>: The user access task expired.
     *        </p>
     *        </li>
     * @see ResultStatus
     */

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    /**
     * <p>
     * The status of the user access result item.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The user access task is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The user access task completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The user access task failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code>: The user access task expired.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the user access result item.</p>
     *         <p>
     *         The following states are possible:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IN_PROGRESS</code>: The user access task is in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLETED</code>: The user access task completed successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The user access task failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EXPIRED</code>: The user access task expired.
     *         </p>
     *         </li>
     * @see ResultStatus
     */

    public String getResultStatus() {
        return this.resultStatus;
    }

    /**
     * <p>
     * The status of the user access result item.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The user access task is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The user access task completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The user access task failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code>: The user access task expired.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resultStatus
     *        The status of the user access result item.</p>
     *        <p>
     *        The following states are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The user access task is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code>: The user access task completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The user access task failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPIRED</code>: The user access task expired.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResultStatus
     */

    public UserAccessResultItem withResultStatus(String resultStatus) {
        setResultStatus(resultStatus);
        return this;
    }

    /**
     * <p>
     * The status of the user access result item.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IN_PROGRESS</code>: The user access task is in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLETED</code>: The user access task completed successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The user access task failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EXPIRED</code>: The user access task expired.
     * </p>
     * </li>
     * </ul>
     * 
     * @param resultStatus
     *        The status of the user access result item.</p>
     *        <p>
     *        The following states are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IN_PROGRESS</code>: The user access task is in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLETED</code>: The user access task completed successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The user access task failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EXPIRED</code>: The user access task expired.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResultStatus
     */

    public UserAccessResultItem withResultStatus(ResultStatus resultStatus) {
        this.resultStatus = resultStatus.toString();
        return this;
    }

    /**
     * <p>
     * The email address of the target user.
     * </p>
     * 
     * @param email
     *        The email address of the target user.
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * <p>
     * The email address of the target user.
     * </p>
     * 
     * @return The email address of the target user.
     */

    public String getEmail() {
        return this.email;
    }

    /**
     * <p>
     * The email address of the target user.
     * </p>
     * 
     * @param email
     *        The email address of the target user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAccessResultItem withEmail(String email) {
        setEmail(email);
        return this;
    }

    /**
     * <p>
     * The unique ID of user.
     * </p>
     * 
     * @param userId
     *        The unique ID of user.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The unique ID of user.
     * </p>
     * 
     * @return The unique ID of user.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The unique ID of user.
     * </p>
     * 
     * @param userId
     *        The unique ID of user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAccessResultItem withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The full name of the user.
     * </p>
     * 
     * @param userFullName
     *        The full name of the user.
     */

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    /**
     * <p>
     * The full name of the user.
     * </p>
     * 
     * @return The full name of the user.
     */

    public String getUserFullName() {
        return this.userFullName;
    }

    /**
     * <p>
     * The full name of the user.
     * </p>
     * 
     * @param userFullName
     *        The full name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAccessResultItem withUserFullName(String userFullName) {
        setUserFullName(userFullName);
        return this;
    }

    /**
     * <p>
     * The first name of the user.
     * </p>
     * 
     * @param userFirstName
     *        The first name of the user.
     */

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    /**
     * <p>
     * The first name of the user.
     * </p>
     * 
     * @return The first name of the user.
     */

    public String getUserFirstName() {
        return this.userFirstName;
    }

    /**
     * <p>
     * The first name of the user.
     * </p>
     * 
     * @param userFirstName
     *        The first name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAccessResultItem withUserFirstName(String userFirstName) {
        setUserFirstName(userFirstName);
        return this;
    }

    /**
     * <p>
     * The last name of the user.
     * </p>
     * 
     * @param userLastName
     *        The last name of the user.
     */

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    /**
     * <p>
     * The last name of the user.
     * </p>
     * 
     * @return The last name of the user.
     */

    public String getUserLastName() {
        return this.userLastName;
    }

    /**
     * <p>
     * The last name of the user.
     * </p>
     * 
     * @param userLastName
     *        The last name of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAccessResultItem withUserLastName(String userLastName) {
        setUserLastName(userLastName);
        return this;
    }

    /**
     * <p>
     * The status of the user returned by the application.
     * </p>
     * 
     * @param userStatus
     *        The status of the user returned by the application.
     */

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * <p>
     * The status of the user returned by the application.
     * </p>
     * 
     * @return The status of the user returned by the application.
     */

    public String getUserStatus() {
        return this.userStatus;
    }

    /**
     * <p>
     * The status of the user returned by the application.
     * </p>
     * 
     * @param userStatus
     *        The status of the user returned by the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAccessResultItem withUserStatus(String userStatus) {
        setUserStatus(userStatus);
        return this;
    }

    /**
     * <p>
     * Contains information about an error returned from a user access task.
     * </p>
     * 
     * @param taskError
     *        Contains information about an error returned from a user access task.
     */

    public void setTaskError(TaskError taskError) {
        this.taskError = taskError;
    }

    /**
     * <p>
     * Contains information about an error returned from a user access task.
     * </p>
     * 
     * @return Contains information about an error returned from a user access task.
     */

    public TaskError getTaskError() {
        return this.taskError;
    }

    /**
     * <p>
     * Contains information about an error returned from a user access task.
     * </p>
     * 
     * @param taskError
     *        Contains information about an error returned from a user access task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserAccessResultItem withTaskError(TaskError taskError) {
        setTaskError(taskError);
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
        if (getApp() != null)
            sb.append("App: ").append(getApp()).append(",");
        if (getTenantId() != null)
            sb.append("TenantId: ").append(getTenantId()).append(",");
        if (getTenantDisplayName() != null)
            sb.append("TenantDisplayName: ").append(getTenantDisplayName()).append(",");
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getResultStatus() != null)
            sb.append("ResultStatus: ").append(getResultStatus()).append(",");
        if (getEmail() != null)
            sb.append("Email: ").append("***Sensitive Data Redacted***").append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append("***Sensitive Data Redacted***").append(",");
        if (getUserFullName() != null)
            sb.append("UserFullName: ").append("***Sensitive Data Redacted***").append(",");
        if (getUserFirstName() != null)
            sb.append("UserFirstName: ").append("***Sensitive Data Redacted***").append(",");
        if (getUserLastName() != null)
            sb.append("UserLastName: ").append("***Sensitive Data Redacted***").append(",");
        if (getUserStatus() != null)
            sb.append("UserStatus: ").append(getUserStatus()).append(",");
        if (getTaskError() != null)
            sb.append("TaskError: ").append(getTaskError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserAccessResultItem == false)
            return false;
        UserAccessResultItem other = (UserAccessResultItem) obj;
        if (other.getApp() == null ^ this.getApp() == null)
            return false;
        if (other.getApp() != null && other.getApp().equals(this.getApp()) == false)
            return false;
        if (other.getTenantId() == null ^ this.getTenantId() == null)
            return false;
        if (other.getTenantId() != null && other.getTenantId().equals(this.getTenantId()) == false)
            return false;
        if (other.getTenantDisplayName() == null ^ this.getTenantDisplayName() == null)
            return false;
        if (other.getTenantDisplayName() != null && other.getTenantDisplayName().equals(this.getTenantDisplayName()) == false)
            return false;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getResultStatus() == null ^ this.getResultStatus() == null)
            return false;
        if (other.getResultStatus() != null && other.getResultStatus().equals(this.getResultStatus()) == false)
            return false;
        if (other.getEmail() == null ^ this.getEmail() == null)
            return false;
        if (other.getEmail() != null && other.getEmail().equals(this.getEmail()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getUserFullName() == null ^ this.getUserFullName() == null)
            return false;
        if (other.getUserFullName() != null && other.getUserFullName().equals(this.getUserFullName()) == false)
            return false;
        if (other.getUserFirstName() == null ^ this.getUserFirstName() == null)
            return false;
        if (other.getUserFirstName() != null && other.getUserFirstName().equals(this.getUserFirstName()) == false)
            return false;
        if (other.getUserLastName() == null ^ this.getUserLastName() == null)
            return false;
        if (other.getUserLastName() != null && other.getUserLastName().equals(this.getUserLastName()) == false)
            return false;
        if (other.getUserStatus() == null ^ this.getUserStatus() == null)
            return false;
        if (other.getUserStatus() != null && other.getUserStatus().equals(this.getUserStatus()) == false)
            return false;
        if (other.getTaskError() == null ^ this.getTaskError() == null)
            return false;
        if (other.getTaskError() != null && other.getTaskError().equals(this.getTaskError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApp() == null) ? 0 : getApp().hashCode());
        hashCode = prime * hashCode + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        hashCode = prime * hashCode + ((getTenantDisplayName() == null) ? 0 : getTenantDisplayName().hashCode());
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        hashCode = prime * hashCode + ((getResultStatus() == null) ? 0 : getResultStatus().hashCode());
        hashCode = prime * hashCode + ((getEmail() == null) ? 0 : getEmail().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getUserFullName() == null) ? 0 : getUserFullName().hashCode());
        hashCode = prime * hashCode + ((getUserFirstName() == null) ? 0 : getUserFirstName().hashCode());
        hashCode = prime * hashCode + ((getUserLastName() == null) ? 0 : getUserLastName().hashCode());
        hashCode = prime * hashCode + ((getUserStatus() == null) ? 0 : getUserStatus().hashCode());
        hashCode = prime * hashCode + ((getTaskError() == null) ? 0 : getTaskError().hashCode());
        return hashCode;
    }

    @Override
    public UserAccessResultItem clone() {
        try {
            return (UserAccessResultItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appfabric.model.transform.UserAccessResultItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
