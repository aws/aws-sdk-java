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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifyInstanceEventStartTimeRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyInstanceEventStartTimeRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<ModifyInstanceEventStartTimeRequest> {

    /**
     * <p>
     * The ID of the instance with the scheduled event.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The ID of the event whose date and time you are modifying.
     * </p>
     */
    private String instanceEventId;
    /**
     * <p>
     * The new date and time when the event will take place.
     * </p>
     */
    private java.util.Date notBefore;

    /**
     * <p>
     * The ID of the instance with the scheduled event.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance with the scheduled event.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance with the scheduled event.
     * </p>
     * 
     * @return The ID of the instance with the scheduled event.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance with the scheduled event.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance with the scheduled event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceEventStartTimeRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The ID of the event whose date and time you are modifying.
     * </p>
     * 
     * @param instanceEventId
     *        The ID of the event whose date and time you are modifying.
     */

    public void setInstanceEventId(String instanceEventId) {
        this.instanceEventId = instanceEventId;
    }

    /**
     * <p>
     * The ID of the event whose date and time you are modifying.
     * </p>
     * 
     * @return The ID of the event whose date and time you are modifying.
     */

    public String getInstanceEventId() {
        return this.instanceEventId;
    }

    /**
     * <p>
     * The ID of the event whose date and time you are modifying.
     * </p>
     * 
     * @param instanceEventId
     *        The ID of the event whose date and time you are modifying.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceEventStartTimeRequest withInstanceEventId(String instanceEventId) {
        setInstanceEventId(instanceEventId);
        return this;
    }

    /**
     * <p>
     * The new date and time when the event will take place.
     * </p>
     * 
     * @param notBefore
     *        The new date and time when the event will take place.
     */

    public void setNotBefore(java.util.Date notBefore) {
        this.notBefore = notBefore;
    }

    /**
     * <p>
     * The new date and time when the event will take place.
     * </p>
     * 
     * @return The new date and time when the event will take place.
     */

    public java.util.Date getNotBefore() {
        return this.notBefore;
    }

    /**
     * <p>
     * The new date and time when the event will take place.
     * </p>
     * 
     * @param notBefore
     *        The new date and time when the event will take place.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyInstanceEventStartTimeRequest withNotBefore(java.util.Date notBefore) {
        setNotBefore(notBefore);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifyInstanceEventStartTimeRequest> getDryRunRequest() {
        Request<ModifyInstanceEventStartTimeRequest> request = new ModifyInstanceEventStartTimeRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getInstanceEventId() != null)
            sb.append("InstanceEventId: ").append(getInstanceEventId()).append(",");
        if (getNotBefore() != null)
            sb.append("NotBefore: ").append(getNotBefore());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyInstanceEventStartTimeRequest == false)
            return false;
        ModifyInstanceEventStartTimeRequest other = (ModifyInstanceEventStartTimeRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceEventId() == null ^ this.getInstanceEventId() == null)
            return false;
        if (other.getInstanceEventId() != null && other.getInstanceEventId().equals(this.getInstanceEventId()) == false)
            return false;
        if (other.getNotBefore() == null ^ this.getNotBefore() == null)
            return false;
        if (other.getNotBefore() != null && other.getNotBefore().equals(this.getNotBefore()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceEventId() == null) ? 0 : getInstanceEventId().hashCode());
        hashCode = prime * hashCode + ((getNotBefore() == null) ? 0 : getNotBefore().hashCode());
        return hashCode;
    }

    @Override
    public ModifyInstanceEventStartTimeRequest clone() {
        return (ModifyInstanceEventStartTimeRequest) super.clone();
    }
}
