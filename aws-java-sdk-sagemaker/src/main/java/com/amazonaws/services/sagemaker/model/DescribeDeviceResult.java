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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DescribeDevice" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDeviceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     */
    private String deviceArn;
    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * A description of the device.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the fleet the device belongs to.
     * </p>
     */
    private String deviceFleetName;
    /**
     * <p>
     * The Amazon Web Services Internet of Things (IoT) object thing name associated with the device.
     * </p>
     */
    private String iotThingName;
    /**
     * <p>
     * The timestamp of the last registration or de-reregistration.
     * </p>
     */
    private java.util.Date registrationTime;
    /**
     * <p>
     * The last heartbeat received from the device.
     * </p>
     */
    private java.util.Date latestHeartbeat;
    /**
     * <p>
     * Models on the device.
     * </p>
     */
    private java.util.List<EdgeModel> models;
    /**
     * <p>
     * The maximum number of models.
     * </p>
     */
    private Integer maxModels;
    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @param deviceArn
     *        The Amazon Resource Name (ARN) of the device.
     */

    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the device.
     */

    public String getDeviceArn() {
        return this.deviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device.
     * </p>
     * 
     * @param deviceArn
     *        The Amazon Resource Name (ARN) of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withDeviceArn(String deviceArn) {
        setDeviceArn(deviceArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     * 
     * @param deviceName
     *        The unique identifier of the device.
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     * 
     * @return The unique identifier of the device.
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The unique identifier of the device.
     * </p>
     * 
     * @param deviceName
     *        The unique identifier of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * A description of the device.
     * </p>
     * 
     * @param description
     *        A description of the device.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the device.
     * </p>
     * 
     * @return A description of the device.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the device.
     * </p>
     * 
     * @param description
     *        A description of the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the fleet the device belongs to.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet the device belongs to.
     */

    public void setDeviceFleetName(String deviceFleetName) {
        this.deviceFleetName = deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet the device belongs to.
     * </p>
     * 
     * @return The name of the fleet the device belongs to.
     */

    public String getDeviceFleetName() {
        return this.deviceFleetName;
    }

    /**
     * <p>
     * The name of the fleet the device belongs to.
     * </p>
     * 
     * @param deviceFleetName
     *        The name of the fleet the device belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withDeviceFleetName(String deviceFleetName) {
        setDeviceFleetName(deviceFleetName);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Internet of Things (IoT) object thing name associated with the device.
     * </p>
     * 
     * @param iotThingName
     *        The Amazon Web Services Internet of Things (IoT) object thing name associated with the device.
     */

    public void setIotThingName(String iotThingName) {
        this.iotThingName = iotThingName;
    }

    /**
     * <p>
     * The Amazon Web Services Internet of Things (IoT) object thing name associated with the device.
     * </p>
     * 
     * @return The Amazon Web Services Internet of Things (IoT) object thing name associated with the device.
     */

    public String getIotThingName() {
        return this.iotThingName;
    }

    /**
     * <p>
     * The Amazon Web Services Internet of Things (IoT) object thing name associated with the device.
     * </p>
     * 
     * @param iotThingName
     *        The Amazon Web Services Internet of Things (IoT) object thing name associated with the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withIotThingName(String iotThingName) {
        setIotThingName(iotThingName);
        return this;
    }

    /**
     * <p>
     * The timestamp of the last registration or de-reregistration.
     * </p>
     * 
     * @param registrationTime
     *        The timestamp of the last registration or de-reregistration.
     */

    public void setRegistrationTime(java.util.Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    /**
     * <p>
     * The timestamp of the last registration or de-reregistration.
     * </p>
     * 
     * @return The timestamp of the last registration or de-reregistration.
     */

    public java.util.Date getRegistrationTime() {
        return this.registrationTime;
    }

    /**
     * <p>
     * The timestamp of the last registration or de-reregistration.
     * </p>
     * 
     * @param registrationTime
     *        The timestamp of the last registration or de-reregistration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withRegistrationTime(java.util.Date registrationTime) {
        setRegistrationTime(registrationTime);
        return this;
    }

    /**
     * <p>
     * The last heartbeat received from the device.
     * </p>
     * 
     * @param latestHeartbeat
     *        The last heartbeat received from the device.
     */

    public void setLatestHeartbeat(java.util.Date latestHeartbeat) {
        this.latestHeartbeat = latestHeartbeat;
    }

    /**
     * <p>
     * The last heartbeat received from the device.
     * </p>
     * 
     * @return The last heartbeat received from the device.
     */

    public java.util.Date getLatestHeartbeat() {
        return this.latestHeartbeat;
    }

    /**
     * <p>
     * The last heartbeat received from the device.
     * </p>
     * 
     * @param latestHeartbeat
     *        The last heartbeat received from the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withLatestHeartbeat(java.util.Date latestHeartbeat) {
        setLatestHeartbeat(latestHeartbeat);
        return this;
    }

    /**
     * <p>
     * Models on the device.
     * </p>
     * 
     * @return Models on the device.
     */

    public java.util.List<EdgeModel> getModels() {
        return models;
    }

    /**
     * <p>
     * Models on the device.
     * </p>
     * 
     * @param models
     *        Models on the device.
     */

    public void setModels(java.util.Collection<EdgeModel> models) {
        if (models == null) {
            this.models = null;
            return;
        }

        this.models = new java.util.ArrayList<EdgeModel>(models);
    }

    /**
     * <p>
     * Models on the device.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setModels(java.util.Collection)} or {@link #withModels(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param models
     *        Models on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withModels(EdgeModel... models) {
        if (this.models == null) {
            setModels(new java.util.ArrayList<EdgeModel>(models.length));
        }
        for (EdgeModel ele : models) {
            this.models.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Models on the device.
     * </p>
     * 
     * @param models
     *        Models on the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withModels(java.util.Collection<EdgeModel> models) {
        setModels(models);
        return this;
    }

    /**
     * <p>
     * The maximum number of models.
     * </p>
     * 
     * @param maxModels
     *        The maximum number of models.
     */

    public void setMaxModels(Integer maxModels) {
        this.maxModels = maxModels;
    }

    /**
     * <p>
     * The maximum number of models.
     * </p>
     * 
     * @return The maximum number of models.
     */

    public Integer getMaxModels() {
        return this.maxModels;
    }

    /**
     * <p>
     * The maximum number of models.
     * </p>
     * 
     * @param maxModels
     *        The maximum number of models.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withMaxModels(Integer maxModels) {
        setMaxModels(maxModels);
        return this;
    }

    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     * 
     * @param nextToken
     *        The response from the last list when returning a list large enough to need tokening.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     * 
     * @return The response from the last list when returning a list large enough to need tokening.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     * 
     * @param nextToken
     *        The response from the last list when returning a list large enough to need tokening.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDeviceResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDeviceArn() != null)
            sb.append("DeviceArn: ").append(getDeviceArn()).append(",");
        if (getDeviceName() != null)
            sb.append("DeviceName: ").append(getDeviceName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDeviceFleetName() != null)
            sb.append("DeviceFleetName: ").append(getDeviceFleetName()).append(",");
        if (getIotThingName() != null)
            sb.append("IotThingName: ").append(getIotThingName()).append(",");
        if (getRegistrationTime() != null)
            sb.append("RegistrationTime: ").append(getRegistrationTime()).append(",");
        if (getLatestHeartbeat() != null)
            sb.append("LatestHeartbeat: ").append(getLatestHeartbeat()).append(",");
        if (getModels() != null)
            sb.append("Models: ").append(getModels()).append(",");
        if (getMaxModels() != null)
            sb.append("MaxModels: ").append(getMaxModels()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDeviceResult == false)
            return false;
        DescribeDeviceResult other = (DescribeDeviceResult) obj;
        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDeviceFleetName() == null ^ this.getDeviceFleetName() == null)
            return false;
        if (other.getDeviceFleetName() != null && other.getDeviceFleetName().equals(this.getDeviceFleetName()) == false)
            return false;
        if (other.getIotThingName() == null ^ this.getIotThingName() == null)
            return false;
        if (other.getIotThingName() != null && other.getIotThingName().equals(this.getIotThingName()) == false)
            return false;
        if (other.getRegistrationTime() == null ^ this.getRegistrationTime() == null)
            return false;
        if (other.getRegistrationTime() != null && other.getRegistrationTime().equals(this.getRegistrationTime()) == false)
            return false;
        if (other.getLatestHeartbeat() == null ^ this.getLatestHeartbeat() == null)
            return false;
        if (other.getLatestHeartbeat() != null && other.getLatestHeartbeat().equals(this.getLatestHeartbeat()) == false)
            return false;
        if (other.getModels() == null ^ this.getModels() == null)
            return false;
        if (other.getModels() != null && other.getModels().equals(this.getModels()) == false)
            return false;
        if (other.getMaxModels() == null ^ this.getMaxModels() == null)
            return false;
        if (other.getMaxModels() != null && other.getMaxModels().equals(this.getMaxModels()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDeviceFleetName() == null) ? 0 : getDeviceFleetName().hashCode());
        hashCode = prime * hashCode + ((getIotThingName() == null) ? 0 : getIotThingName().hashCode());
        hashCode = prime * hashCode + ((getRegistrationTime() == null) ? 0 : getRegistrationTime().hashCode());
        hashCode = prime * hashCode + ((getLatestHeartbeat() == null) ? 0 : getLatestHeartbeat().hashCode());
        hashCode = prime * hashCode + ((getModels() == null) ? 0 : getModels().hashCode());
        hashCode = prime * hashCode + ((getMaxModels() == null) ? 0 : getMaxModels().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDeviceResult clone() {
        try {
            return (DescribeDeviceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
