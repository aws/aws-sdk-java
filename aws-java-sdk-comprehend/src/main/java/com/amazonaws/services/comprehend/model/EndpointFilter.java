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
package com.amazonaws.services.comprehend.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The filter used to determine which endpoints are are returned. You can filter jobs on their name, model, status, or
 * the date and time that they were created. You can only set one filter at a time.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/comprehend-2017-11-27/EndpointFilter" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * Specifies the status of the endpoint being returned. Possible values are: Creating, Ready, Updating, Deleting,
     * Failed.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies a date before which the returned endpoint or endpoints were created.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * Specifies a date after which the returned endpoint or endpoints were created.
     * </p>
     */
    private java.util.Date creationTimeAfter;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
     * </p>
     * 
     * @param modelArn
     *        The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointFilter withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * Specifies the status of the endpoint being returned. Possible values are: Creating, Ready, Updating, Deleting,
     * Failed.
     * </p>
     * 
     * @param status
     *        Specifies the status of the endpoint being returned. Possible values are: Creating, Ready, Updating,
     *        Deleting, Failed.
     * @see EndpointStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status of the endpoint being returned. Possible values are: Creating, Ready, Updating, Deleting,
     * Failed.
     * </p>
     * 
     * @return Specifies the status of the endpoint being returned. Possible values are: Creating, Ready, Updating,
     *         Deleting, Failed.
     * @see EndpointStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the status of the endpoint being returned. Possible values are: Creating, Ready, Updating, Deleting,
     * Failed.
     * </p>
     * 
     * @param status
     *        Specifies the status of the endpoint being returned. Possible values are: Creating, Ready, Updating,
     *        Deleting, Failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public EndpointFilter withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies the status of the endpoint being returned. Possible values are: Creating, Ready, Updating, Deleting,
     * Failed.
     * </p>
     * 
     * @param status
     *        Specifies the status of the endpoint being returned. Possible values are: Creating, Ready, Updating,
     *        Deleting, Failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointStatus
     */

    public EndpointFilter withStatus(EndpointStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a date before which the returned endpoint or endpoints were created.
     * </p>
     * 
     * @param creationTimeBefore
     *        Specifies a date before which the returned endpoint or endpoints were created.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * Specifies a date before which the returned endpoint or endpoints were created.
     * </p>
     * 
     * @return Specifies a date before which the returned endpoint or endpoints were created.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * Specifies a date before which the returned endpoint or endpoints were created.
     * </p>
     * 
     * @param creationTimeBefore
     *        Specifies a date before which the returned endpoint or endpoints were created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointFilter withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * Specifies a date after which the returned endpoint or endpoints were created.
     * </p>
     * 
     * @param creationTimeAfter
     *        Specifies a date after which the returned endpoint or endpoints were created.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * Specifies a date after which the returned endpoint or endpoints were created.
     * </p>
     * 
     * @return Specifies a date after which the returned endpoint or endpoints were created.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * Specifies a date after which the returned endpoint or endpoints were created.
     * </p>
     * 
     * @param creationTimeAfter
     *        Specifies a date after which the returned endpoint or endpoints were created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointFilter withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
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
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointFilter == false)
            return false;
        EndpointFilter other = (EndpointFilter) obj;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        return hashCode;
    }

    @Override
    public EndpointFilter clone() {
        try {
            return (EndpointFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.comprehend.model.transform.EndpointFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
