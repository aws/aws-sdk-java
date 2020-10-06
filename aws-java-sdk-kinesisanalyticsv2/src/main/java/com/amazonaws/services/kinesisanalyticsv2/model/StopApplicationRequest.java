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
package com.amazonaws.services.kinesisanalyticsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisanalyticsv2-2018-05-23/StopApplication" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopApplicationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the running application to stop.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * Set to <code>true</code> to force the application to stop. If you set <code>Force</code> to <code>true</code>,
     * Kinesis Data Analytics stops the application without taking a snapshot.
     * </p>
     * <p>
     * You can only force stop a Flink-based Kinesis Data Analytics application. You can't force stop a SQL-based
     * Kinesis Data Analytics application.
     * </p>
     * <p>
     * The application must be in the <code>STARTING</code>, <code>UPDATING</code>, <code>STOPPING</code>,
     * <code>AUTOSCALING</code>, or <code>RUNNING</code> state.
     * </p>
     */
    private Boolean force;

    /**
     * <p>
     * The name of the running application to stop.
     * </p>
     * 
     * @param applicationName
     *        The name of the running application to stop.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of the running application to stop.
     * </p>
     * 
     * @return The name of the running application to stop.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of the running application to stop.
     * </p>
     * 
     * @param applicationName
     *        The name of the running application to stop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopApplicationRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to force the application to stop. If you set <code>Force</code> to <code>true</code>,
     * Kinesis Data Analytics stops the application without taking a snapshot.
     * </p>
     * <p>
     * You can only force stop a Flink-based Kinesis Data Analytics application. You can't force stop a SQL-based
     * Kinesis Data Analytics application.
     * </p>
     * <p>
     * The application must be in the <code>STARTING</code>, <code>UPDATING</code>, <code>STOPPING</code>,
     * <code>AUTOSCALING</code>, or <code>RUNNING</code> state.
     * </p>
     * 
     * @param force
     *        Set to <code>true</code> to force the application to stop. If you set <code>Force</code> to
     *        <code>true</code>, Kinesis Data Analytics stops the application without taking a snapshot.</p>
     *        <p>
     *        You can only force stop a Flink-based Kinesis Data Analytics application. You can't force stop a SQL-based
     *        Kinesis Data Analytics application.
     *        </p>
     *        <p>
     *        The application must be in the <code>STARTING</code>, <code>UPDATING</code>, <code>STOPPING</code>,
     *        <code>AUTOSCALING</code>, or <code>RUNNING</code> state.
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Set to <code>true</code> to force the application to stop. If you set <code>Force</code> to <code>true</code>,
     * Kinesis Data Analytics stops the application without taking a snapshot.
     * </p>
     * <p>
     * You can only force stop a Flink-based Kinesis Data Analytics application. You can't force stop a SQL-based
     * Kinesis Data Analytics application.
     * </p>
     * <p>
     * The application must be in the <code>STARTING</code>, <code>UPDATING</code>, <code>STOPPING</code>,
     * <code>AUTOSCALING</code>, or <code>RUNNING</code> state.
     * </p>
     * 
     * @return Set to <code>true</code> to force the application to stop. If you set <code>Force</code> to
     *         <code>true</code>, Kinesis Data Analytics stops the application without taking a snapshot.</p>
     *         <p>
     *         You can only force stop a Flink-based Kinesis Data Analytics application. You can't force stop a
     *         SQL-based Kinesis Data Analytics application.
     *         </p>
     *         <p>
     *         The application must be in the <code>STARTING</code>, <code>UPDATING</code>, <code>STOPPING</code>,
     *         <code>AUTOSCALING</code>, or <code>RUNNING</code> state.
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * Set to <code>true</code> to force the application to stop. If you set <code>Force</code> to <code>true</code>,
     * Kinesis Data Analytics stops the application without taking a snapshot.
     * </p>
     * <p>
     * You can only force stop a Flink-based Kinesis Data Analytics application. You can't force stop a SQL-based
     * Kinesis Data Analytics application.
     * </p>
     * <p>
     * The application must be in the <code>STARTING</code>, <code>UPDATING</code>, <code>STOPPING</code>,
     * <code>AUTOSCALING</code>, or <code>RUNNING</code> state.
     * </p>
     * 
     * @param force
     *        Set to <code>true</code> to force the application to stop. If you set <code>Force</code> to
     *        <code>true</code>, Kinesis Data Analytics stops the application without taking a snapshot.</p>
     *        <p>
     *        You can only force stop a Flink-based Kinesis Data Analytics application. You can't force stop a SQL-based
     *        Kinesis Data Analytics application.
     *        </p>
     *        <p>
     *        The application must be in the <code>STARTING</code>, <code>UPDATING</code>, <code>STOPPING</code>,
     *        <code>AUTOSCALING</code>, or <code>RUNNING</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopApplicationRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * Set to <code>true</code> to force the application to stop. If you set <code>Force</code> to <code>true</code>,
     * Kinesis Data Analytics stops the application without taking a snapshot.
     * </p>
     * <p>
     * You can only force stop a Flink-based Kinesis Data Analytics application. You can't force stop a SQL-based
     * Kinesis Data Analytics application.
     * </p>
     * <p>
     * The application must be in the <code>STARTING</code>, <code>UPDATING</code>, <code>STOPPING</code>,
     * <code>AUTOSCALING</code>, or <code>RUNNING</code> state.
     * </p>
     * 
     * @return Set to <code>true</code> to force the application to stop. If you set <code>Force</code> to
     *         <code>true</code>, Kinesis Data Analytics stops the application without taking a snapshot.</p>
     *         <p>
     *         You can only force stop a Flink-based Kinesis Data Analytics application. You can't force stop a
     *         SQL-based Kinesis Data Analytics application.
     *         </p>
     *         <p>
     *         The application must be in the <code>STARTING</code>, <code>UPDATING</code>, <code>STOPPING</code>,
     *         <code>AUTOSCALING</code>, or <code>RUNNING</code> state.
     */

    public Boolean isForce() {
        return this.force;
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getForce() != null)
            sb.append("Force: ").append(getForce());
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
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public StopApplicationRequest clone() {
        return (StopApplicationRequest) super.clone();
    }

}
