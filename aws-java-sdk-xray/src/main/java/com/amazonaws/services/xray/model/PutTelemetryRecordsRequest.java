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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/PutTelemetryRecords" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutTelemetryRecordsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** <p/> */
    private java.util.List<TelemetryRecord> telemetryRecords;
    /** <p/> */
    private String eC2InstanceId;
    /** <p/> */
    private String hostname;
    /** <p/> */
    private String resourceARN;

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<TelemetryRecord> getTelemetryRecords() {
        return telemetryRecords;
    }

    /**
     * <p/>
     * 
     * @param telemetryRecords
     */

    public void setTelemetryRecords(java.util.Collection<TelemetryRecord> telemetryRecords) {
        if (telemetryRecords == null) {
            this.telemetryRecords = null;
            return;
        }

        this.telemetryRecords = new java.util.ArrayList<TelemetryRecord>(telemetryRecords);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTelemetryRecords(java.util.Collection)} or {@link #withTelemetryRecords(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param telemetryRecords
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTelemetryRecordsRequest withTelemetryRecords(TelemetryRecord... telemetryRecords) {
        if (this.telemetryRecords == null) {
            setTelemetryRecords(new java.util.ArrayList<TelemetryRecord>(telemetryRecords.length));
        }
        for (TelemetryRecord ele : telemetryRecords) {
            this.telemetryRecords.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param telemetryRecords
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTelemetryRecordsRequest withTelemetryRecords(java.util.Collection<TelemetryRecord> telemetryRecords) {
        setTelemetryRecords(telemetryRecords);
        return this;
    }

    /**
     * <p/>
     * 
     * @param eC2InstanceId
     */

    public void setEC2InstanceId(String eC2InstanceId) {
        this.eC2InstanceId = eC2InstanceId;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getEC2InstanceId() {
        return this.eC2InstanceId;
    }

    /**
     * <p/>
     * 
     * @param eC2InstanceId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTelemetryRecordsRequest withEC2InstanceId(String eC2InstanceId) {
        setEC2InstanceId(eC2InstanceId);
        return this;
    }

    /**
     * <p/>
     * 
     * @param hostname
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p/>
     * 
     * @param hostname
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTelemetryRecordsRequest withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p/>
     * 
     * @param resourceARN
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p/>
     * 
     * @param resourceARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTelemetryRecordsRequest withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
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
        if (getTelemetryRecords() != null)
            sb.append("TelemetryRecords: ").append(getTelemetryRecords()).append(",");
        if (getEC2InstanceId() != null)
            sb.append("EC2InstanceId: ").append(getEC2InstanceId()).append(",");
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutTelemetryRecordsRequest == false)
            return false;
        PutTelemetryRecordsRequest other = (PutTelemetryRecordsRequest) obj;
        if (other.getTelemetryRecords() == null ^ this.getTelemetryRecords() == null)
            return false;
        if (other.getTelemetryRecords() != null && other.getTelemetryRecords().equals(this.getTelemetryRecords()) == false)
            return false;
        if (other.getEC2InstanceId() == null ^ this.getEC2InstanceId() == null)
            return false;
        if (other.getEC2InstanceId() != null && other.getEC2InstanceId().equals(this.getEC2InstanceId()) == false)
            return false;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTelemetryRecords() == null) ? 0 : getTelemetryRecords().hashCode());
        hashCode = prime * hashCode + ((getEC2InstanceId() == null) ? 0 : getEC2InstanceId().hashCode());
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        return hashCode;
    }

    @Override
    public PutTelemetryRecordsRequest clone() {
        return (PutTelemetryRecordsRequest) super.clone();
    }

}
