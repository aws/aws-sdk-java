/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates and submits a request to start a remote access session.
 * </p>
 */
public class CreateRemoteAccessSessionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     * </p>
     */
    private String projectArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     * </p>
     */
    private String deviceArn;
    /**
     * <p>
     * The name of the remote access session that you wish to create.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The configuration information for the remote access session request.
     * </p>
     */
    private CreateRemoteAccessSessionConfiguration configuration;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     */

    public void setProjectArn(String projectArn) {
        this.projectArn = projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     */

    public String getProjectArn() {
        return this.projectArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     * </p>
     * 
     * @param projectArn
     *        The Amazon Resource Name (ARN) of the project for which you want to create a remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withProjectArn(String projectArn) {
        setProjectArn(projectArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     * </p>
     * 
     * @param deviceArn
     *        The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     */

    public void setDeviceArn(String deviceArn) {
        this.deviceArn = deviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     */

    public String getDeviceArn() {
        return this.deviceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     * </p>
     * 
     * @param deviceArn
     *        The Amazon Resource Name (ARN) of the device for which you want to create a remote access session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withDeviceArn(String deviceArn) {
        setDeviceArn(deviceArn);
        return this;
    }

    /**
     * <p>
     * The name of the remote access session that you wish to create.
     * </p>
     * 
     * @param name
     *        The name of the remote access session that you wish to create.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the remote access session that you wish to create.
     * </p>
     * 
     * @return The name of the remote access session that you wish to create.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the remote access session that you wish to create.
     * </p>
     * 
     * @param name
     *        The name of the remote access session that you wish to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The configuration information for the remote access session request.
     * </p>
     * 
     * @param configuration
     *        The configuration information for the remote access session request.
     */

    public void setConfiguration(CreateRemoteAccessSessionConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The configuration information for the remote access session request.
     * </p>
     * 
     * @return The configuration information for the remote access session request.
     */

    public CreateRemoteAccessSessionConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * <p>
     * The configuration information for the remote access session request.
     * </p>
     * 
     * @param configuration
     *        The configuration information for the remote access session request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRemoteAccessSessionRequest withConfiguration(CreateRemoteAccessSessionConfiguration configuration) {
        setConfiguration(configuration);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getProjectArn() != null)
            sb.append("ProjectArn: " + getProjectArn() + ",");
        if (getDeviceArn() != null)
            sb.append("DeviceArn: " + getDeviceArn() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getConfiguration() != null)
            sb.append("Configuration: " + getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRemoteAccessSessionRequest == false)
            return false;
        CreateRemoteAccessSessionRequest other = (CreateRemoteAccessSessionRequest) obj;
        if (other.getProjectArn() == null ^ this.getProjectArn() == null)
            return false;
        if (other.getProjectArn() != null && other.getProjectArn().equals(this.getProjectArn()) == false)
            return false;
        if (other.getDeviceArn() == null ^ this.getDeviceArn() == null)
            return false;
        if (other.getDeviceArn() != null && other.getDeviceArn().equals(this.getDeviceArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProjectArn() == null) ? 0 : getProjectArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceArn() == null) ? 0 : getDeviceArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateRemoteAccessSessionRequest clone() {
        return (CreateRemoteAccessSessionRequest) super.clone();
    }
}
