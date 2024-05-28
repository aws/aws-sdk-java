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
package com.amazonaws.services.ssmsap.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-sap-2018-05-10/StopApplication" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * Specify the <code>ConnectedEntityType</code>. Accepted type is <code>DBMS</code>.
     * </p>
     * <p>
     * If this parameter is included, the connected DBMS (Database Management System) will be stopped.
     * </p>
     */
    private String stopConnectedEntity;
    /**
     * <p>
     * Boolean. If included and if set to <code>True</code>, the StopApplication operation will shut down the associated
     * Amazon EC2 instance in addition to the application.
     * </p>
     */
    private Boolean includeEc2InstanceShutdown;

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @return The ID of the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param applicationId
     *        The ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopApplicationRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * Specify the <code>ConnectedEntityType</code>. Accepted type is <code>DBMS</code>.
     * </p>
     * <p>
     * If this parameter is included, the connected DBMS (Database Management System) will be stopped.
     * </p>
     * 
     * @param stopConnectedEntity
     *        Specify the <code>ConnectedEntityType</code>. Accepted type is <code>DBMS</code>.</p>
     *        <p>
     *        If this parameter is included, the connected DBMS (Database Management System) will be stopped.
     * @see ConnectedEntityType
     */

    public void setStopConnectedEntity(String stopConnectedEntity) {
        this.stopConnectedEntity = stopConnectedEntity;
    }

    /**
     * <p>
     * Specify the <code>ConnectedEntityType</code>. Accepted type is <code>DBMS</code>.
     * </p>
     * <p>
     * If this parameter is included, the connected DBMS (Database Management System) will be stopped.
     * </p>
     * 
     * @return Specify the <code>ConnectedEntityType</code>. Accepted type is <code>DBMS</code>.</p>
     *         <p>
     *         If this parameter is included, the connected DBMS (Database Management System) will be stopped.
     * @see ConnectedEntityType
     */

    public String getStopConnectedEntity() {
        return this.stopConnectedEntity;
    }

    /**
     * <p>
     * Specify the <code>ConnectedEntityType</code>. Accepted type is <code>DBMS</code>.
     * </p>
     * <p>
     * If this parameter is included, the connected DBMS (Database Management System) will be stopped.
     * </p>
     * 
     * @param stopConnectedEntity
     *        Specify the <code>ConnectedEntityType</code>. Accepted type is <code>DBMS</code>.</p>
     *        <p>
     *        If this parameter is included, the connected DBMS (Database Management System) will be stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectedEntityType
     */

    public StopApplicationRequest withStopConnectedEntity(String stopConnectedEntity) {
        setStopConnectedEntity(stopConnectedEntity);
        return this;
    }

    /**
     * <p>
     * Specify the <code>ConnectedEntityType</code>. Accepted type is <code>DBMS</code>.
     * </p>
     * <p>
     * If this parameter is included, the connected DBMS (Database Management System) will be stopped.
     * </p>
     * 
     * @param stopConnectedEntity
     *        Specify the <code>ConnectedEntityType</code>. Accepted type is <code>DBMS</code>.</p>
     *        <p>
     *        If this parameter is included, the connected DBMS (Database Management System) will be stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConnectedEntityType
     */

    public StopApplicationRequest withStopConnectedEntity(ConnectedEntityType stopConnectedEntity) {
        this.stopConnectedEntity = stopConnectedEntity.toString();
        return this;
    }

    /**
     * <p>
     * Boolean. If included and if set to <code>True</code>, the StopApplication operation will shut down the associated
     * Amazon EC2 instance in addition to the application.
     * </p>
     * 
     * @param includeEc2InstanceShutdown
     *        Boolean. If included and if set to <code>True</code>, the StopApplication operation will shut down the
     *        associated Amazon EC2 instance in addition to the application.
     */

    public void setIncludeEc2InstanceShutdown(Boolean includeEc2InstanceShutdown) {
        this.includeEc2InstanceShutdown = includeEc2InstanceShutdown;
    }

    /**
     * <p>
     * Boolean. If included and if set to <code>True</code>, the StopApplication operation will shut down the associated
     * Amazon EC2 instance in addition to the application.
     * </p>
     * 
     * @return Boolean. If included and if set to <code>True</code>, the StopApplication operation will shut down the
     *         associated Amazon EC2 instance in addition to the application.
     */

    public Boolean getIncludeEc2InstanceShutdown() {
        return this.includeEc2InstanceShutdown;
    }

    /**
     * <p>
     * Boolean. If included and if set to <code>True</code>, the StopApplication operation will shut down the associated
     * Amazon EC2 instance in addition to the application.
     * </p>
     * 
     * @param includeEc2InstanceShutdown
     *        Boolean. If included and if set to <code>True</code>, the StopApplication operation will shut down the
     *        associated Amazon EC2 instance in addition to the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopApplicationRequest withIncludeEc2InstanceShutdown(Boolean includeEc2InstanceShutdown) {
        setIncludeEc2InstanceShutdown(includeEc2InstanceShutdown);
        return this;
    }

    /**
     * <p>
     * Boolean. If included and if set to <code>True</code>, the StopApplication operation will shut down the associated
     * Amazon EC2 instance in addition to the application.
     * </p>
     * 
     * @return Boolean. If included and if set to <code>True</code>, the StopApplication operation will shut down the
     *         associated Amazon EC2 instance in addition to the application.
     */

    public Boolean isIncludeEc2InstanceShutdown() {
        return this.includeEc2InstanceShutdown;
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getStopConnectedEntity() != null)
            sb.append("StopConnectedEntity: ").append(getStopConnectedEntity()).append(",");
        if (getIncludeEc2InstanceShutdown() != null)
            sb.append("IncludeEc2InstanceShutdown: ").append(getIncludeEc2InstanceShutdown());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopApplicationRequest == false)
            return false;
        StopApplicationRequest other = (StopApplicationRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getStopConnectedEntity() == null ^ this.getStopConnectedEntity() == null)
            return false;
        if (other.getStopConnectedEntity() != null && other.getStopConnectedEntity().equals(this.getStopConnectedEntity()) == false)
            return false;
        if (other.getIncludeEc2InstanceShutdown() == null ^ this.getIncludeEc2InstanceShutdown() == null)
            return false;
        if (other.getIncludeEc2InstanceShutdown() != null && other.getIncludeEc2InstanceShutdown().equals(this.getIncludeEc2InstanceShutdown()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getStopConnectedEntity() == null) ? 0 : getStopConnectedEntity().hashCode());
        hashCode = prime * hashCode + ((getIncludeEc2InstanceShutdown() == null) ? 0 : getIncludeEc2InstanceShutdown().hashCode());
        return hashCode;
    }

    @Override
    public StopApplicationRequest clone() {
        return (StopApplicationRequest) super.clone();
    }

}
