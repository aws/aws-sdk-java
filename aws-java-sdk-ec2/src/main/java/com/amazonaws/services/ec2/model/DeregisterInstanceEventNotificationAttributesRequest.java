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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DeregisterInstanceEventNotificationAttributesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeregisterInstanceEventNotificationAttributesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable,
        DryRunSupportedRequest<DeregisterInstanceEventNotificationAttributesRequest> {

    /**
     * <p>
     * Information about the tag keys to deregister.
     * </p>
     */
    private DeregisterInstanceTagAttributeRequest instanceTagAttribute;

    /**
     * <p>
     * Information about the tag keys to deregister.
     * </p>
     * 
     * @param instanceTagAttribute
     *        Information about the tag keys to deregister.
     */

    public void setInstanceTagAttribute(DeregisterInstanceTagAttributeRequest instanceTagAttribute) {
        this.instanceTagAttribute = instanceTagAttribute;
    }

    /**
     * <p>
     * Information about the tag keys to deregister.
     * </p>
     * 
     * @return Information about the tag keys to deregister.
     */

    public DeregisterInstanceTagAttributeRequest getInstanceTagAttribute() {
        return this.instanceTagAttribute;
    }

    /**
     * <p>
     * Information about the tag keys to deregister.
     * </p>
     * 
     * @param instanceTagAttribute
     *        Information about the tag keys to deregister.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeregisterInstanceEventNotificationAttributesRequest withInstanceTagAttribute(DeregisterInstanceTagAttributeRequest instanceTagAttribute) {
        setInstanceTagAttribute(instanceTagAttribute);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<DeregisterInstanceEventNotificationAttributesRequest> getDryRunRequest() {
        Request<DeregisterInstanceEventNotificationAttributesRequest> request = new DeregisterInstanceEventNotificationAttributesRequestMarshaller()
                .marshall(this);
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
        if (getInstanceTagAttribute() != null)
            sb.append("InstanceTagAttribute: ").append(getInstanceTagAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterInstanceEventNotificationAttributesRequest == false)
            return false;
        DeregisterInstanceEventNotificationAttributesRequest other = (DeregisterInstanceEventNotificationAttributesRequest) obj;
        if (other.getInstanceTagAttribute() == null ^ this.getInstanceTagAttribute() == null)
            return false;
        if (other.getInstanceTagAttribute() != null && other.getInstanceTagAttribute().equals(this.getInstanceTagAttribute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceTagAttribute() == null) ? 0 : getInstanceTagAttribute().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterInstanceEventNotificationAttributesRequest clone() {
        return (DeregisterInstanceEventNotificationAttributesRequest) super.clone();
    }
}
