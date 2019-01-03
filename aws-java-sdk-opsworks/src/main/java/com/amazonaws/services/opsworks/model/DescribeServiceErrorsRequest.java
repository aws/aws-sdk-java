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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeServiceErrors" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeServiceErrorsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The stack ID. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions of the errors
     * associated with the specified stack.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The instance ID. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions of the errors
     * associated with the specified instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * An array of service error IDs. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions
     * of the specified errors. Otherwise, it returns a description of every error.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> serviceErrorIds;

    /**
     * <p>
     * The stack ID. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions of the errors
     * associated with the specified stack.
     * </p>
     * 
     * @param stackId
     *        The stack ID. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions of the
     *        errors associated with the specified stack.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ID. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions of the errors
     * associated with the specified stack.
     * </p>
     * 
     * @return The stack ID. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions of the
     *         errors associated with the specified stack.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ID. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions of the errors
     * associated with the specified stack.
     * </p>
     * 
     * @param stackId
     *        The stack ID. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions of the
     *        errors associated with the specified stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceErrorsRequest withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The instance ID. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions of the errors
     * associated with the specified instance.
     * </p>
     * 
     * @param instanceId
     *        The instance ID. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions of the
     *        errors associated with the specified instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions of the errors
     * associated with the specified instance.
     * </p>
     * 
     * @return The instance ID. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions of
     *         the errors associated with the specified instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions of the errors
     * associated with the specified instance.
     * </p>
     * 
     * @param instanceId
     *        The instance ID. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions of the
     *        errors associated with the specified instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceErrorsRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * An array of service error IDs. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions
     * of the specified errors. Otherwise, it returns a description of every error.
     * </p>
     * 
     * @return An array of service error IDs. If you use this parameter, <code>DescribeServiceErrors</code> returns
     *         descriptions of the specified errors. Otherwise, it returns a description of every error.
     */

    public java.util.List<String> getServiceErrorIds() {
        if (serviceErrorIds == null) {
            serviceErrorIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return serviceErrorIds;
    }

    /**
     * <p>
     * An array of service error IDs. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions
     * of the specified errors. Otherwise, it returns a description of every error.
     * </p>
     * 
     * @param serviceErrorIds
     *        An array of service error IDs. If you use this parameter, <code>DescribeServiceErrors</code> returns
     *        descriptions of the specified errors. Otherwise, it returns a description of every error.
     */

    public void setServiceErrorIds(java.util.Collection<String> serviceErrorIds) {
        if (serviceErrorIds == null) {
            this.serviceErrorIds = null;
            return;
        }

        this.serviceErrorIds = new com.amazonaws.internal.SdkInternalList<String>(serviceErrorIds);
    }

    /**
     * <p>
     * An array of service error IDs. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions
     * of the specified errors. Otherwise, it returns a description of every error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceErrorIds(java.util.Collection)} or {@link #withServiceErrorIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param serviceErrorIds
     *        An array of service error IDs. If you use this parameter, <code>DescribeServiceErrors</code> returns
     *        descriptions of the specified errors. Otherwise, it returns a description of every error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceErrorsRequest withServiceErrorIds(String... serviceErrorIds) {
        if (this.serviceErrorIds == null) {
            setServiceErrorIds(new com.amazonaws.internal.SdkInternalList<String>(serviceErrorIds.length));
        }
        for (String ele : serviceErrorIds) {
            this.serviceErrorIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of service error IDs. If you use this parameter, <code>DescribeServiceErrors</code> returns descriptions
     * of the specified errors. Otherwise, it returns a description of every error.
     * </p>
     * 
     * @param serviceErrorIds
     *        An array of service error IDs. If you use this parameter, <code>DescribeServiceErrors</code> returns
     *        descriptions of the specified errors. Otherwise, it returns a description of every error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeServiceErrorsRequest withServiceErrorIds(java.util.Collection<String> serviceErrorIds) {
        setServiceErrorIds(serviceErrorIds);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getServiceErrorIds() != null)
            sb.append("ServiceErrorIds: ").append(getServiceErrorIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeServiceErrorsRequest == false)
            return false;
        DescribeServiceErrorsRequest other = (DescribeServiceErrorsRequest) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getServiceErrorIds() == null ^ this.getServiceErrorIds() == null)
            return false;
        if (other.getServiceErrorIds() != null && other.getServiceErrorIds().equals(this.getServiceErrorIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getServiceErrorIds() == null) ? 0 : getServiceErrorIds().hashCode());
        return hashCode;
    }

    @Override
    public DescribeServiceErrorsRequest clone() {
        return (DescribeServiceErrorsRequest) super.clone();
    }

}
