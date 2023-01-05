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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that contains information about whether this app monitor stores a copy of the telemetry data that RUM
 * collects using CloudWatch Logs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/DataStorage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataStorage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A structure that contains the information about whether the app monitor stores copies of the data that RUM
     * collects in CloudWatch Logs. If it does, this structure also contains the name of the log group.
     * </p>
     */
    private CwLog cwLog;

    /**
     * <p>
     * A structure that contains the information about whether the app monitor stores copies of the data that RUM
     * collects in CloudWatch Logs. If it does, this structure also contains the name of the log group.
     * </p>
     * 
     * @param cwLog
     *        A structure that contains the information about whether the app monitor stores copies of the data that RUM
     *        collects in CloudWatch Logs. If it does, this structure also contains the name of the log group.
     */

    public void setCwLog(CwLog cwLog) {
        this.cwLog = cwLog;
    }

    /**
     * <p>
     * A structure that contains the information about whether the app monitor stores copies of the data that RUM
     * collects in CloudWatch Logs. If it does, this structure also contains the name of the log group.
     * </p>
     * 
     * @return A structure that contains the information about whether the app monitor stores copies of the data that
     *         RUM collects in CloudWatch Logs. If it does, this structure also contains the name of the log group.
     */

    public CwLog getCwLog() {
        return this.cwLog;
    }

    /**
     * <p>
     * A structure that contains the information about whether the app monitor stores copies of the data that RUM
     * collects in CloudWatch Logs. If it does, this structure also contains the name of the log group.
     * </p>
     * 
     * @param cwLog
     *        A structure that contains the information about whether the app monitor stores copies of the data that RUM
     *        collects in CloudWatch Logs. If it does, this structure also contains the name of the log group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataStorage withCwLog(CwLog cwLog) {
        setCwLog(cwLog);
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
        if (getCwLog() != null)
            sb.append("CwLog: ").append(getCwLog());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataStorage == false)
            return false;
        DataStorage other = (DataStorage) obj;
        if (other.getCwLog() == null ^ this.getCwLog() == null)
            return false;
        if (other.getCwLog() != null && other.getCwLog().equals(this.getCwLog()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCwLog() == null) ? 0 : getCwLog().hashCode());
        return hashCode;
    }

    @Override
    public DataStorage clone() {
        try {
            return (DataStorage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchrum.model.transform.DataStorageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
