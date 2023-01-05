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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An endpoint that hosts a model displayed in the Amazon SageMaker Model Dashboard.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelDashboardEndpoint" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelDashboardEndpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The endpoint name.
     * </p>
     */
    private String endpointName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     */
    private String endpointArn;
    /**
     * <p>
     * A timestamp that indicates when the endpoint was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time the endpoint was modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;
    /**
     * <p>
     * The endpoint status.
     * </p>
     */
    private String endpointStatus;

    /**
     * <p>
     * The endpoint name.
     * </p>
     * 
     * @param endpointName
     *        The endpoint name.
     */

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    /**
     * <p>
     * The endpoint name.
     * </p>
     * 
     * @return The endpoint name.
     */

    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * <p>
     * The endpoint name.
     * </p>
     * 
     * @param endpointName
     *        The endpoint name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardEndpoint withEndpointName(String endpointName) {
        setEndpointName(endpointName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) of the endpoint.
     */

    public void setEndpointArn(String endpointArn) {
        this.endpointArn = endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the endpoint.
     */

    public String getEndpointArn() {
        return this.endpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * 
     * @param endpointArn
     *        The Amazon Resource Name (ARN) of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardEndpoint withEndpointArn(String endpointArn) {
        setEndpointArn(endpointArn);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the endpoint was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that indicates when the endpoint was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the endpoint was created.
     * </p>
     * 
     * @return A timestamp that indicates when the endpoint was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the endpoint was created.
     * </p>
     * 
     * @param creationTime
     *        A timestamp that indicates when the endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardEndpoint withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time the endpoint was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time the endpoint was modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last time the endpoint was modified.
     * </p>
     * 
     * @return The last time the endpoint was modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last time the endpoint was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time the endpoint was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelDashboardEndpoint withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
        return this;
    }

    /**
     * <p>
     * The endpoint status.
     * </p>
     * 
     * @param endpointStatus
     *        The endpoint status.
     * @see EndpointStatus
     */

    public void setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
    }

    /**
     * <p>
     * The endpoint status.
     * </p>
     * 
     * @return The endpoint status.
     * @see EndpointStatus
     */

    public String getEndpointStatus() {
        return this.endpointStatus;
    }

    /**
     * <p>
     * The endpoint status.
     * </p>
     * 
     * @param endpointStatus
     *        The endpoint status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public ModelDashboardEndpoint withEndpointStatus(String endpointStatus) {
        setEndpointStatus(endpointStatus);
        return this;
    }

    /**
     * <p>
     * The endpoint status.
     * </p>
     * 
     * @param endpointStatus
     *        The endpoint status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public ModelDashboardEndpoint withEndpointStatus(EndpointStatus endpointStatus) {
        this.endpointStatus = endpointStatus.toString();
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
        if (getEndpointName() != null)
            sb.append("EndpointName: ").append(getEndpointName()).append(",");
        if (getEndpointArn() != null)
            sb.append("EndpointArn: ").append(getEndpointArn()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime()).append(",");
        if (getEndpointStatus() != null)
            sb.append("EndpointStatus: ").append(getEndpointStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelDashboardEndpoint == false)
            return false;
        ModelDashboardEndpoint other = (ModelDashboardEndpoint) obj;
        if (other.getEndpointName() == null ^ this.getEndpointName() == null)
            return false;
        if (other.getEndpointName() != null && other.getEndpointName().equals(this.getEndpointName()) == false)
            return false;
        if (other.getEndpointArn() == null ^ this.getEndpointArn() == null)
            return false;
        if (other.getEndpointArn() != null && other.getEndpointArn().equals(this.getEndpointArn()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        if (other.getEndpointStatus() == null ^ this.getEndpointStatus() == null)
            return false;
        if (other.getEndpointStatus() != null && other.getEndpointStatus().equals(this.getEndpointStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointName() == null) ? 0 : getEndpointName().hashCode());
        hashCode = prime * hashCode + ((getEndpointArn() == null) ? 0 : getEndpointArn().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        hashCode = prime * hashCode + ((getEndpointStatus() == null) ? 0 : getEndpointStatus().hashCode());
        return hashCode;
    }

    @Override
    public ModelDashboardEndpoint clone() {
        try {
            return (ModelDashboardEndpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelDashboardEndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
