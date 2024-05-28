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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/BatchGetUserAccessTasks" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetUserAccessTasksRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the request.
     * </p>
     */
    private String appBundleIdentifier;
    /**
     * <p>
     * The tasks IDs to use for the request.
     * </p>
     */
    private java.util.List<String> taskIdList;

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the request.
     * </p>
     * 
     * @param appBundleIdentifier
     *        The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the
     *        request.
     */

    public void setAppBundleIdentifier(String appBundleIdentifier) {
        this.appBundleIdentifier = appBundleIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the request.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the
     *         request.
     */

    public String getAppBundleIdentifier() {
        return this.appBundleIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the request.
     * </p>
     * 
     * @param appBundleIdentifier
     *        The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetUserAccessTasksRequest withAppBundleIdentifier(String appBundleIdentifier) {
        setAppBundleIdentifier(appBundleIdentifier);
        return this;
    }

    /**
     * <p>
     * The tasks IDs to use for the request.
     * </p>
     * 
     * @return The tasks IDs to use for the request.
     */

    public java.util.List<String> getTaskIdList() {
        return taskIdList;
    }

    /**
     * <p>
     * The tasks IDs to use for the request.
     * </p>
     * 
     * @param taskIdList
     *        The tasks IDs to use for the request.
     */

    public void setTaskIdList(java.util.Collection<String> taskIdList) {
        if (taskIdList == null) {
            this.taskIdList = null;
            return;
        }

        this.taskIdList = new java.util.ArrayList<String>(taskIdList);
    }

    /**
     * <p>
     * The tasks IDs to use for the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTaskIdList(java.util.Collection)} or {@link #withTaskIdList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param taskIdList
     *        The tasks IDs to use for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetUserAccessTasksRequest withTaskIdList(String... taskIdList) {
        if (this.taskIdList == null) {
            setTaskIdList(new java.util.ArrayList<String>(taskIdList.length));
        }
        for (String ele : taskIdList) {
            this.taskIdList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tasks IDs to use for the request.
     * </p>
     * 
     * @param taskIdList
     *        The tasks IDs to use for the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetUserAccessTasksRequest withTaskIdList(java.util.Collection<String> taskIdList) {
        setTaskIdList(taskIdList);
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
        if (getAppBundleIdentifier() != null)
            sb.append("AppBundleIdentifier: ").append(getAppBundleIdentifier()).append(",");
        if (getTaskIdList() != null)
            sb.append("TaskIdList: ").append(getTaskIdList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetUserAccessTasksRequest == false)
            return false;
        BatchGetUserAccessTasksRequest other = (BatchGetUserAccessTasksRequest) obj;
        if (other.getAppBundleIdentifier() == null ^ this.getAppBundleIdentifier() == null)
            return false;
        if (other.getAppBundleIdentifier() != null && other.getAppBundleIdentifier().equals(this.getAppBundleIdentifier()) == false)
            return false;
        if (other.getTaskIdList() == null ^ this.getTaskIdList() == null)
            return false;
        if (other.getTaskIdList() != null && other.getTaskIdList().equals(this.getTaskIdList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppBundleIdentifier() == null) ? 0 : getAppBundleIdentifier().hashCode());
        hashCode = prime * hashCode + ((getTaskIdList() == null) ? 0 : getTaskIdList().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetUserAccessTasksRequest clone() {
        return (BatchGetUserAccessTasksRequest) super.clone();
    }

}
