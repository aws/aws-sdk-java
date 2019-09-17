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
import com.amazonaws.services.ec2.model.transform.TerminateInstancesRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TerminateInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<TerminateInstancesRequest> {

    /**
     * <p>
     * The IDs of the instances.
     * </p>
     * <p>
     * Constraints: Up to 1000 instance IDs. We recommend breaking up this request into smaller batches.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;

    /**
     * Default constructor for TerminateInstancesRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public TerminateInstancesRequest() {
    }

    /**
     * Constructs a new TerminateInstancesRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param instanceIds
     *        The IDs of the instances.</p>
     *        <p>
     *        Constraints: Up to 1000 instance IDs. We recommend breaking up this request into smaller batches.
     */
    public TerminateInstancesRequest(java.util.List<String> instanceIds) {
        setInstanceIds(instanceIds);
    }

    /**
     * <p>
     * The IDs of the instances.
     * </p>
     * <p>
     * Constraints: Up to 1000 instance IDs. We recommend breaking up this request into smaller batches.
     * </p>
     * 
     * @return The IDs of the instances.</p>
     *         <p>
     *         Constraints: Up to 1000 instance IDs. We recommend breaking up this request into smaller batches.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * The IDs of the instances.
     * </p>
     * <p>
     * Constraints: Up to 1000 instance IDs. We recommend breaking up this request into smaller batches.
     * </p>
     * 
     * @param instanceIds
     *        The IDs of the instances.</p>
     *        <p>
     *        Constraints: Up to 1000 instance IDs. We recommend breaking up this request into smaller batches.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(instanceIds);
    }

    /**
     * <p>
     * The IDs of the instances.
     * </p>
     * <p>
     * Constraints: Up to 1000 instance IDs. We recommend breaking up this request into smaller batches.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceIds(java.util.Collection)} or {@link #withInstanceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceIds
     *        The IDs of the instances.</p>
     *        <p>
     *        Constraints: Up to 1000 instance IDs. We recommend breaking up this request into smaller batches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateInstancesRequest withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the instances.
     * </p>
     * <p>
     * Constraints: Up to 1000 instance IDs. We recommend breaking up this request into smaller batches.
     * </p>
     * 
     * @param instanceIds
     *        The IDs of the instances.</p>
     *        <p>
     *        Constraints: Up to 1000 instance IDs. We recommend breaking up this request into smaller batches.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TerminateInstancesRequest withInstanceIds(java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<TerminateInstancesRequest> getDryRunRequest() {
        Request<TerminateInstancesRequest> request = new TerminateInstancesRequestMarshaller().marshall(this);
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
        if (getInstanceIds() != null)
            sb.append("InstanceIds: ").append(getInstanceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminateInstancesRequest == false)
            return false;
        TerminateInstancesRequest other = (TerminateInstancesRequest) obj;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        return hashCode;
    }

    @Override
    public TerminateInstancesRequest clone() {
        return (TerminateInstancesRequest) super.clone();
    }
}
