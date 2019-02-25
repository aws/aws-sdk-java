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
package com.amazonaws.services.mediastore.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This section describes operations that you can perform on an AWS Elemental MediaStore container.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/Container" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Container implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The DNS endpoint of the container. Use the endpoint to identify the specific container when sending requests to
     * the data plane. The service assigns this value when the container is created. Once the value has been assigned,
     * it does not change.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * Unix timestamp.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container. The ARN has the following format:
     * </p>
     * <p>
     * arn:aws:&lt;region&gt;:&lt;account that owns this container&gt;:container/&lt;name of container&gt;
     * </p>
     * <p>
     * For example: arn:aws:mediastore:us-west-2:111122223333:container/movies
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The name of the container.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of container creation or deletion. The status is one of the following: <code>CREATING</code>,
     * <code>ACTIVE</code>, or <code>DELETING</code>. While the service is creating the container, the status is
     * <code>CREATING</code>. When the endpoint is available, the status changes to <code>ACTIVE</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The state of access logging on the container. This value is <code>false</code> by default, indicating that AWS
     * Elemental MediaStore does not send access logs to Amazon CloudWatch Logs. When you enable access logging on the
     * container, MediaStore changes this value to <code>true</code>, indicating that the service delivers access logs
     * for objects stored in that container to CloudWatch Logs.
     * </p>
     */
    private Boolean accessLoggingEnabled;

    /**
     * <p>
     * The DNS endpoint of the container. Use the endpoint to identify the specific container when sending requests to
     * the data plane. The service assigns this value when the container is created. Once the value has been assigned,
     * it does not change.
     * </p>
     * 
     * @param endpoint
     *        The DNS endpoint of the container. Use the endpoint to identify the specific container when sending
     *        requests to the data plane. The service assigns this value when the container is created. Once the value
     *        has been assigned, it does not change.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The DNS endpoint of the container. Use the endpoint to identify the specific container when sending requests to
     * the data plane. The service assigns this value when the container is created. Once the value has been assigned,
     * it does not change.
     * </p>
     * 
     * @return The DNS endpoint of the container. Use the endpoint to identify the specific container when sending
     *         requests to the data plane. The service assigns this value when the container is created. Once the value
     *         has been assigned, it does not change.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The DNS endpoint of the container. Use the endpoint to identify the specific container when sending requests to
     * the data plane. The service assigns this value when the container is created. Once the value has been assigned,
     * it does not change.
     * </p>
     * 
     * @param endpoint
     *        The DNS endpoint of the container. Use the endpoint to identify the specific container when sending
     *        requests to the data plane. The service assigns this value when the container is created. Once the value
     *        has been assigned, it does not change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * Unix timestamp.
     * </p>
     * 
     * @param creationTime
     *        Unix timestamp.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Unix timestamp.
     * </p>
     * 
     * @return Unix timestamp.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Unix timestamp.
     * </p>
     * 
     * @param creationTime
     *        Unix timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container. The ARN has the following format:
     * </p>
     * <p>
     * arn:aws:&lt;region&gt;:&lt;account that owns this container&gt;:container/&lt;name of container&gt;
     * </p>
     * <p>
     * For example: arn:aws:mediastore:us-west-2:111122223333:container/movies
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the container. The ARN has the following format:</p>
     *        <p>
     *        arn:aws:&lt;region&gt;:&lt;account that owns this container&gt;:container/&lt;name of container&gt;
     *        </p>
     *        <p>
     *        For example: arn:aws:mediastore:us-west-2:111122223333:container/movies
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container. The ARN has the following format:
     * </p>
     * <p>
     * arn:aws:&lt;region&gt;:&lt;account that owns this container&gt;:container/&lt;name of container&gt;
     * </p>
     * <p>
     * For example: arn:aws:mediastore:us-west-2:111122223333:container/movies
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the container. The ARN has the following format:</p>
     *         <p>
     *         arn:aws:&lt;region&gt;:&lt;account that owns this container&gt;:container/&lt;name of container&gt;
     *         </p>
     *         <p>
     *         For example: arn:aws:mediastore:us-west-2:111122223333:container/movies
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container. The ARN has the following format:
     * </p>
     * <p>
     * arn:aws:&lt;region&gt;:&lt;account that owns this container&gt;:container/&lt;name of container&gt;
     * </p>
     * <p>
     * For example: arn:aws:mediastore:us-west-2:111122223333:container/movies
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the container. The ARN has the following format:</p>
     *        <p>
     *        arn:aws:&lt;region&gt;:&lt;account that owns this container&gt;:container/&lt;name of container&gt;
     *        </p>
     *        <p>
     *        For example: arn:aws:mediastore:us-west-2:111122223333:container/movies
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @param name
     *        The name of the container.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @return The name of the container.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the container.
     * </p>
     * 
     * @param name
     *        The name of the container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of container creation or deletion. The status is one of the following: <code>CREATING</code>,
     * <code>ACTIVE</code>, or <code>DELETING</code>. While the service is creating the container, the status is
     * <code>CREATING</code>. When the endpoint is available, the status changes to <code>ACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The status of container creation or deletion. The status is one of the following: <code>CREATING</code>,
     *        <code>ACTIVE</code>, or <code>DELETING</code>. While the service is creating the container, the status is
     *        <code>CREATING</code>. When the endpoint is available, the status changes to <code>ACTIVE</code>.
     * @see ContainerStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of container creation or deletion. The status is one of the following: <code>CREATING</code>,
     * <code>ACTIVE</code>, or <code>DELETING</code>. While the service is creating the container, the status is
     * <code>CREATING</code>. When the endpoint is available, the status changes to <code>ACTIVE</code>.
     * </p>
     * 
     * @return The status of container creation or deletion. The status is one of the following: <code>CREATING</code>,
     *         <code>ACTIVE</code>, or <code>DELETING</code>. While the service is creating the container, the status is
     *         <code>CREATING</code>. When the endpoint is available, the status changes to <code>ACTIVE</code>.
     * @see ContainerStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of container creation or deletion. The status is one of the following: <code>CREATING</code>,
     * <code>ACTIVE</code>, or <code>DELETING</code>. While the service is creating the container, the status is
     * <code>CREATING</code>. When the endpoint is available, the status changes to <code>ACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The status of container creation or deletion. The status is one of the following: <code>CREATING</code>,
     *        <code>ACTIVE</code>, or <code>DELETING</code>. While the service is creating the container, the status is
     *        <code>CREATING</code>. When the endpoint is available, the status changes to <code>ACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerStatus
     */

    public Container withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of container creation or deletion. The status is one of the following: <code>CREATING</code>,
     * <code>ACTIVE</code>, or <code>DELETING</code>. While the service is creating the container, the status is
     * <code>CREATING</code>. When the endpoint is available, the status changes to <code>ACTIVE</code>.
     * </p>
     * 
     * @param status
     *        The status of container creation or deletion. The status is one of the following: <code>CREATING</code>,
     *        <code>ACTIVE</code>, or <code>DELETING</code>. While the service is creating the container, the status is
     *        <code>CREATING</code>. When the endpoint is available, the status changes to <code>ACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ContainerStatus
     */

    public Container withStatus(ContainerStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The state of access logging on the container. This value is <code>false</code> by default, indicating that AWS
     * Elemental MediaStore does not send access logs to Amazon CloudWatch Logs. When you enable access logging on the
     * container, MediaStore changes this value to <code>true</code>, indicating that the service delivers access logs
     * for objects stored in that container to CloudWatch Logs.
     * </p>
     * 
     * @param accessLoggingEnabled
     *        The state of access logging on the container. This value is <code>false</code> by default, indicating that
     *        AWS Elemental MediaStore does not send access logs to Amazon CloudWatch Logs. When you enable access
     *        logging on the container, MediaStore changes this value to <code>true</code>, indicating that the service
     *        delivers access logs for objects stored in that container to CloudWatch Logs.
     */

    public void setAccessLoggingEnabled(Boolean accessLoggingEnabled) {
        this.accessLoggingEnabled = accessLoggingEnabled;
    }

    /**
     * <p>
     * The state of access logging on the container. This value is <code>false</code> by default, indicating that AWS
     * Elemental MediaStore does not send access logs to Amazon CloudWatch Logs. When you enable access logging on the
     * container, MediaStore changes this value to <code>true</code>, indicating that the service delivers access logs
     * for objects stored in that container to CloudWatch Logs.
     * </p>
     * 
     * @return The state of access logging on the container. This value is <code>false</code> by default, indicating
     *         that AWS Elemental MediaStore does not send access logs to Amazon CloudWatch Logs. When you enable access
     *         logging on the container, MediaStore changes this value to <code>true</code>, indicating that the service
     *         delivers access logs for objects stored in that container to CloudWatch Logs.
     */

    public Boolean getAccessLoggingEnabled() {
        return this.accessLoggingEnabled;
    }

    /**
     * <p>
     * The state of access logging on the container. This value is <code>false</code> by default, indicating that AWS
     * Elemental MediaStore does not send access logs to Amazon CloudWatch Logs. When you enable access logging on the
     * container, MediaStore changes this value to <code>true</code>, indicating that the service delivers access logs
     * for objects stored in that container to CloudWatch Logs.
     * </p>
     * 
     * @param accessLoggingEnabled
     *        The state of access logging on the container. This value is <code>false</code> by default, indicating that
     *        AWS Elemental MediaStore does not send access logs to Amazon CloudWatch Logs. When you enable access
     *        logging on the container, MediaStore changes this value to <code>true</code>, indicating that the service
     *        delivers access logs for objects stored in that container to CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Container withAccessLoggingEnabled(Boolean accessLoggingEnabled) {
        setAccessLoggingEnabled(accessLoggingEnabled);
        return this;
    }

    /**
     * <p>
     * The state of access logging on the container. This value is <code>false</code> by default, indicating that AWS
     * Elemental MediaStore does not send access logs to Amazon CloudWatch Logs. When you enable access logging on the
     * container, MediaStore changes this value to <code>true</code>, indicating that the service delivers access logs
     * for objects stored in that container to CloudWatch Logs.
     * </p>
     * 
     * @return The state of access logging on the container. This value is <code>false</code> by default, indicating
     *         that AWS Elemental MediaStore does not send access logs to Amazon CloudWatch Logs. When you enable access
     *         logging on the container, MediaStore changes this value to <code>true</code>, indicating that the service
     *         delivers access logs for objects stored in that container to CloudWatch Logs.
     */

    public Boolean isAccessLoggingEnabled() {
        return this.accessLoggingEnabled;
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
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getAccessLoggingEnabled() != null)
            sb.append("AccessLoggingEnabled: ").append(getAccessLoggingEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Container == false)
            return false;
        Container other = (Container) obj;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAccessLoggingEnabled() == null ^ this.getAccessLoggingEnabled() == null)
            return false;
        if (other.getAccessLoggingEnabled() != null && other.getAccessLoggingEnabled().equals(this.getAccessLoggingEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAccessLoggingEnabled() == null) ? 0 : getAccessLoggingEnabled().hashCode());
        return hashCode;
    }

    @Override
    public Container clone() {
        try {
            return (Container) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediastore.model.transform.ContainerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
