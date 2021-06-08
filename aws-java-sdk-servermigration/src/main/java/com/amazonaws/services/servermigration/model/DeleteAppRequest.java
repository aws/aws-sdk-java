/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/DeleteApp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAppRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * Indicates whether to stop all replication jobs corresponding to the servers in the application while deleting the
     * application.
     * </p>
     */
    private Boolean forceStopAppReplication;
    /**
     * <p>
     * Indicates whether to terminate the stack corresponding to the application while deleting the application.
     * </p>
     */
    private Boolean forceTerminateApp;

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param appId
     *        The ID of the application.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @return The ID of the application.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param appId
     *        The ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAppRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * Indicates whether to stop all replication jobs corresponding to the servers in the application while deleting the
     * application.
     * </p>
     * 
     * @param forceStopAppReplication
     *        Indicates whether to stop all replication jobs corresponding to the servers in the application while
     *        deleting the application.
     */

    public void setForceStopAppReplication(Boolean forceStopAppReplication) {
        this.forceStopAppReplication = forceStopAppReplication;
    }

    /**
     * <p>
     * Indicates whether to stop all replication jobs corresponding to the servers in the application while deleting the
     * application.
     * </p>
     * 
     * @return Indicates whether to stop all replication jobs corresponding to the servers in the application while
     *         deleting the application.
     */

    public Boolean getForceStopAppReplication() {
        return this.forceStopAppReplication;
    }

    /**
     * <p>
     * Indicates whether to stop all replication jobs corresponding to the servers in the application while deleting the
     * application.
     * </p>
     * 
     * @param forceStopAppReplication
     *        Indicates whether to stop all replication jobs corresponding to the servers in the application while
     *        deleting the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAppRequest withForceStopAppReplication(Boolean forceStopAppReplication) {
        setForceStopAppReplication(forceStopAppReplication);
        return this;
    }

    /**
     * <p>
     * Indicates whether to stop all replication jobs corresponding to the servers in the application while deleting the
     * application.
     * </p>
     * 
     * @return Indicates whether to stop all replication jobs corresponding to the servers in the application while
     *         deleting the application.
     */

    public Boolean isForceStopAppReplication() {
        return this.forceStopAppReplication;
    }

    /**
     * <p>
     * Indicates whether to terminate the stack corresponding to the application while deleting the application.
     * </p>
     * 
     * @param forceTerminateApp
     *        Indicates whether to terminate the stack corresponding to the application while deleting the application.
     */

    public void setForceTerminateApp(Boolean forceTerminateApp) {
        this.forceTerminateApp = forceTerminateApp;
    }

    /**
     * <p>
     * Indicates whether to terminate the stack corresponding to the application while deleting the application.
     * </p>
     * 
     * @return Indicates whether to terminate the stack corresponding to the application while deleting the application.
     */

    public Boolean getForceTerminateApp() {
        return this.forceTerminateApp;
    }

    /**
     * <p>
     * Indicates whether to terminate the stack corresponding to the application while deleting the application.
     * </p>
     * 
     * @param forceTerminateApp
     *        Indicates whether to terminate the stack corresponding to the application while deleting the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAppRequest withForceTerminateApp(Boolean forceTerminateApp) {
        setForceTerminateApp(forceTerminateApp);
        return this;
    }

    /**
     * <p>
     * Indicates whether to terminate the stack corresponding to the application while deleting the application.
     * </p>
     * 
     * @return Indicates whether to terminate the stack corresponding to the application while deleting the application.
     */

    public Boolean isForceTerminateApp() {
        return this.forceTerminateApp;
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getForceStopAppReplication() != null)
            sb.append("ForceStopAppReplication: ").append(getForceStopAppReplication()).append(",");
        if (getForceTerminateApp() != null)
            sb.append("ForceTerminateApp: ").append(getForceTerminateApp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAppRequest == false)
            return false;
        DeleteAppRequest other = (DeleteAppRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getForceStopAppReplication() == null ^ this.getForceStopAppReplication() == null)
            return false;
        if (other.getForceStopAppReplication() != null && other.getForceStopAppReplication().equals(this.getForceStopAppReplication()) == false)
            return false;
        if (other.getForceTerminateApp() == null ^ this.getForceTerminateApp() == null)
            return false;
        if (other.getForceTerminateApp() != null && other.getForceTerminateApp().equals(this.getForceTerminateApp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getForceStopAppReplication() == null) ? 0 : getForceStopAppReplication().hashCode());
        hashCode = prime * hashCode + ((getForceTerminateApp() == null) ? 0 : getForceTerminateApp().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAppRequest clone() {
        return (DeleteAppRequest) super.clone();
    }

}
