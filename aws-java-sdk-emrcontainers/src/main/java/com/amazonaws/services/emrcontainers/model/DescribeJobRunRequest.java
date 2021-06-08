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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/DescribeJobRun" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeJobRunRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the job run request.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The ID of the virtual cluster for which the job run is submitted.
     * </p>
     */
    private String virtualClusterId;

    /**
     * <p>
     * The ID of the job run request.
     * </p>
     * 
     * @param id
     *        The ID of the job run request.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the job run request.
     * </p>
     * 
     * @return The ID of the job run request.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the job run request.
     * </p>
     * 
     * @param id
     *        The ID of the job run request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobRunRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual cluster for which the job run is submitted.
     * </p>
     * 
     * @param virtualClusterId
     *        The ID of the virtual cluster for which the job run is submitted.
     */

    public void setVirtualClusterId(String virtualClusterId) {
        this.virtualClusterId = virtualClusterId;
    }

    /**
     * <p>
     * The ID of the virtual cluster for which the job run is submitted.
     * </p>
     * 
     * @return The ID of the virtual cluster for which the job run is submitted.
     */

    public String getVirtualClusterId() {
        return this.virtualClusterId;
    }

    /**
     * <p>
     * The ID of the virtual cluster for which the job run is submitted.
     * </p>
     * 
     * @param virtualClusterId
     *        The ID of the virtual cluster for which the job run is submitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeJobRunRequest withVirtualClusterId(String virtualClusterId) {
        setVirtualClusterId(virtualClusterId);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getVirtualClusterId() != null)
            sb.append("VirtualClusterId: ").append(getVirtualClusterId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJobRunRequest == false)
            return false;
        DescribeJobRunRequest other = (DescribeJobRunRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getVirtualClusterId() == null ^ this.getVirtualClusterId() == null)
            return false;
        if (other.getVirtualClusterId() != null && other.getVirtualClusterId().equals(this.getVirtualClusterId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getVirtualClusterId() == null) ? 0 : getVirtualClusterId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeJobRunRequest clone() {
        return (DescribeJobRunRequest) super.clone();
    }

}
