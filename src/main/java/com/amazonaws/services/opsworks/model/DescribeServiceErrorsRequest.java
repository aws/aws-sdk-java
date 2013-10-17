/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#describeServiceErrors(DescribeServiceErrorsRequest) DescribeServiceErrors operation}.
 * <p>
 * Describes AWS OpsWorks service errors.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#describeServiceErrors(DescribeServiceErrorsRequest)
 */
public class DescribeServiceErrorsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The stack ID. If you use this parameter,
     * <code>DescribeServiceErrors</code> returns descriptions of the errors
     * associated with the specified stack.
     */
    private String stackId;

    /**
     * The instance ID. If you use this parameter,
     * <code>DescribeServiceErrors</code> returns descriptions of the errors
     * associated with the specified instance.
     */
    private String instanceId;

    /**
     * An array of service error IDs. If you use this parameter,
     * <code>DescribeServiceErrors</code> returns descriptions of the
     * specified errors. Otherwise, it returns a description of every error.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> serviceErrorIds;

    /**
     * The stack ID. If you use this parameter,
     * <code>DescribeServiceErrors</code> returns descriptions of the errors
     * associated with the specified stack.
     *
     * @return The stack ID. If you use this parameter,
     *         <code>DescribeServiceErrors</code> returns descriptions of the errors
     *         associated with the specified stack.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The stack ID. If you use this parameter,
     * <code>DescribeServiceErrors</code> returns descriptions of the errors
     * associated with the specified stack.
     *
     * @param stackId The stack ID. If you use this parameter,
     *         <code>DescribeServiceErrors</code> returns descriptions of the errors
     *         associated with the specified stack.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The stack ID. If you use this parameter,
     * <code>DescribeServiceErrors</code> returns descriptions of the errors
     * associated with the specified stack.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The stack ID. If you use this parameter,
     *         <code>DescribeServiceErrors</code> returns descriptions of the errors
     *         associated with the specified stack.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeServiceErrorsRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The instance ID. If you use this parameter,
     * <code>DescribeServiceErrors</code> returns descriptions of the errors
     * associated with the specified instance.
     *
     * @return The instance ID. If you use this parameter,
     *         <code>DescribeServiceErrors</code> returns descriptions of the errors
     *         associated with the specified instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The instance ID. If you use this parameter,
     * <code>DescribeServiceErrors</code> returns descriptions of the errors
     * associated with the specified instance.
     *
     * @param instanceId The instance ID. If you use this parameter,
     *         <code>DescribeServiceErrors</code> returns descriptions of the errors
     *         associated with the specified instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The instance ID. If you use this parameter,
     * <code>DescribeServiceErrors</code> returns descriptions of the errors
     * associated with the specified instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The instance ID. If you use this parameter,
     *         <code>DescribeServiceErrors</code> returns descriptions of the errors
     *         associated with the specified instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeServiceErrorsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * An array of service error IDs. If you use this parameter,
     * <code>DescribeServiceErrors</code> returns descriptions of the
     * specified errors. Otherwise, it returns a description of every error.
     *
     * @return An array of service error IDs. If you use this parameter,
     *         <code>DescribeServiceErrors</code> returns descriptions of the
     *         specified errors. Otherwise, it returns a description of every error.
     */
    public java.util.List<String> getServiceErrorIds() {
        if (serviceErrorIds == null) {
              serviceErrorIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              serviceErrorIds.setAutoConstruct(true);
        }
        return serviceErrorIds;
    }
    
    /**
     * An array of service error IDs. If you use this parameter,
     * <code>DescribeServiceErrors</code> returns descriptions of the
     * specified errors. Otherwise, it returns a description of every error.
     *
     * @param serviceErrorIds An array of service error IDs. If you use this parameter,
     *         <code>DescribeServiceErrors</code> returns descriptions of the
     *         specified errors. Otherwise, it returns a description of every error.
     */
    public void setServiceErrorIds(java.util.Collection<String> serviceErrorIds) {
        if (serviceErrorIds == null) {
            this.serviceErrorIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> serviceErrorIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(serviceErrorIds.size());
        serviceErrorIdsCopy.addAll(serviceErrorIds);
        this.serviceErrorIds = serviceErrorIdsCopy;
    }
    
    /**
     * An array of service error IDs. If you use this parameter,
     * <code>DescribeServiceErrors</code> returns descriptions of the
     * specified errors. Otherwise, it returns a description of every error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceErrorIds An array of service error IDs. If you use this parameter,
     *         <code>DescribeServiceErrors</code> returns descriptions of the
     *         specified errors. Otherwise, it returns a description of every error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeServiceErrorsRequest withServiceErrorIds(String... serviceErrorIds) {
        if (getServiceErrorIds() == null) setServiceErrorIds(new java.util.ArrayList<String>(serviceErrorIds.length));
        for (String value : serviceErrorIds) {
            getServiceErrorIds().add(value);
        }
        return this;
    }
    
    /**
     * An array of service error IDs. If you use this parameter,
     * <code>DescribeServiceErrors</code> returns descriptions of the
     * specified errors. Otherwise, it returns a description of every error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceErrorIds An array of service error IDs. If you use this parameter,
     *         <code>DescribeServiceErrors</code> returns descriptions of the
     *         specified errors. Otherwise, it returns a description of every error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeServiceErrorsRequest withServiceErrorIds(java.util.Collection<String> serviceErrorIds) {
        if (serviceErrorIds == null) {
            this.serviceErrorIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> serviceErrorIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(serviceErrorIds.size());
            serviceErrorIdsCopy.addAll(serviceErrorIds);
            this.serviceErrorIds = serviceErrorIdsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getServiceErrorIds() != null) sb.append("ServiceErrorIds: " + getServiceErrorIds() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeServiceErrorsRequest == false) return false;
        DescribeServiceErrorsRequest other = (DescribeServiceErrorsRequest)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getServiceErrorIds() == null ^ this.getServiceErrorIds() == null) return false;
        if (other.getServiceErrorIds() != null && other.getServiceErrorIds().equals(this.getServiceErrorIds()) == false) return false; 
        return true;
    }
    
}
    