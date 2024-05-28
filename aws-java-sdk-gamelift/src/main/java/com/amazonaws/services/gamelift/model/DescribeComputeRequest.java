/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeCompute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeComputeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the fleet that the compute belongs to. You can use either the fleet ID or ARN value.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The unique identifier of the compute resource to retrieve properties for. For an Anywhere fleet compute, use the
     * registered compute name. For an EC2 fleet instance, use the instance ID. For a container fleet, use the compute
     * name (for example, <code>a123b456c789012d3e4567f8a901b23c/1a234b56-7cd8-9e0f-a1b2-c34d567ef8a9</code>) or the
     * compute ARN.
     * </p>
     */
    private String computeName;

    /**
     * <p>
     * A unique identifier for the fleet that the compute belongs to. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that the compute belongs to. You can use either the fleet ID or ARN
     *        value.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that the compute belongs to. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @return A unique identifier for the fleet that the compute belongs to. You can use either the fleet ID or ARN
     *         value.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that the compute belongs to. You can use either the fleet ID or ARN value.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that the compute belongs to. You can use either the fleet ID or ARN
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComputeRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the compute resource to retrieve properties for. For an Anywhere fleet compute, use the
     * registered compute name. For an EC2 fleet instance, use the instance ID. For a container fleet, use the compute
     * name (for example, <code>a123b456c789012d3e4567f8a901b23c/1a234b56-7cd8-9e0f-a1b2-c34d567ef8a9</code>) or the
     * compute ARN.
     * </p>
     * 
     * @param computeName
     *        The unique identifier of the compute resource to retrieve properties for. For an Anywhere fleet compute,
     *        use the registered compute name. For an EC2 fleet instance, use the instance ID. For a container fleet,
     *        use the compute name (for example,
     *        <code>a123b456c789012d3e4567f8a901b23c/1a234b56-7cd8-9e0f-a1b2-c34d567ef8a9</code>) or the compute ARN.
     */

    public void setComputeName(String computeName) {
        this.computeName = computeName;
    }

    /**
     * <p>
     * The unique identifier of the compute resource to retrieve properties for. For an Anywhere fleet compute, use the
     * registered compute name. For an EC2 fleet instance, use the instance ID. For a container fleet, use the compute
     * name (for example, <code>a123b456c789012d3e4567f8a901b23c/1a234b56-7cd8-9e0f-a1b2-c34d567ef8a9</code>) or the
     * compute ARN.
     * </p>
     * 
     * @return The unique identifier of the compute resource to retrieve properties for. For an Anywhere fleet compute,
     *         use the registered compute name. For an EC2 fleet instance, use the instance ID. For a container fleet,
     *         use the compute name (for example,
     *         <code>a123b456c789012d3e4567f8a901b23c/1a234b56-7cd8-9e0f-a1b2-c34d567ef8a9</code>) or the compute ARN.
     */

    public String getComputeName() {
        return this.computeName;
    }

    /**
     * <p>
     * The unique identifier of the compute resource to retrieve properties for. For an Anywhere fleet compute, use the
     * registered compute name. For an EC2 fleet instance, use the instance ID. For a container fleet, use the compute
     * name (for example, <code>a123b456c789012d3e4567f8a901b23c/1a234b56-7cd8-9e0f-a1b2-c34d567ef8a9</code>) or the
     * compute ARN.
     * </p>
     * 
     * @param computeName
     *        The unique identifier of the compute resource to retrieve properties for. For an Anywhere fleet compute,
     *        use the registered compute name. For an EC2 fleet instance, use the instance ID. For a container fleet,
     *        use the compute name (for example,
     *        <code>a123b456c789012d3e4567f8a901b23c/1a234b56-7cd8-9e0f-a1b2-c34d567ef8a9</code>) or the compute ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeComputeRequest withComputeName(String computeName) {
        setComputeName(computeName);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getComputeName() != null)
            sb.append("ComputeName: ").append(getComputeName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeComputeRequest == false)
            return false;
        DescribeComputeRequest other = (DescribeComputeRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getComputeName() == null ^ this.getComputeName() == null)
            return false;
        if (other.getComputeName() != null && other.getComputeName().equals(this.getComputeName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getComputeName() == null) ? 0 : getComputeName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeComputeRequest clone() {
        return (DescribeComputeRequest) super.clone();
    }

}
