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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/GetCapacityTask" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCapacityTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * ID of the capacity task.
     * </p>
     */
    private String capacityTaskId;
    /**
     * <p>
     * ID or ARN of the Outpost associated with the specified capacity task.
     * </p>
     */
    private String outpostIdentifier;

    /**
     * <p>
     * ID of the capacity task.
     * </p>
     * 
     * @param capacityTaskId
     *        ID of the capacity task.
     */

    public void setCapacityTaskId(String capacityTaskId) {
        this.capacityTaskId = capacityTaskId;
    }

    /**
     * <p>
     * ID of the capacity task.
     * </p>
     * 
     * @return ID of the capacity task.
     */

    public String getCapacityTaskId() {
        return this.capacityTaskId;
    }

    /**
     * <p>
     * ID of the capacity task.
     * </p>
     * 
     * @param capacityTaskId
     *        ID of the capacity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCapacityTaskRequest withCapacityTaskId(String capacityTaskId) {
        setCapacityTaskId(capacityTaskId);
        return this;
    }

    /**
     * <p>
     * ID or ARN of the Outpost associated with the specified capacity task.
     * </p>
     * 
     * @param outpostIdentifier
     *        ID or ARN of the Outpost associated with the specified capacity task.
     */

    public void setOutpostIdentifier(String outpostIdentifier) {
        this.outpostIdentifier = outpostIdentifier;
    }

    /**
     * <p>
     * ID or ARN of the Outpost associated with the specified capacity task.
     * </p>
     * 
     * @return ID or ARN of the Outpost associated with the specified capacity task.
     */

    public String getOutpostIdentifier() {
        return this.outpostIdentifier;
    }

    /**
     * <p>
     * ID or ARN of the Outpost associated with the specified capacity task.
     * </p>
     * 
     * @param outpostIdentifier
     *        ID or ARN of the Outpost associated with the specified capacity task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCapacityTaskRequest withOutpostIdentifier(String outpostIdentifier) {
        setOutpostIdentifier(outpostIdentifier);
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
        if (getCapacityTaskId() != null)
            sb.append("CapacityTaskId: ").append(getCapacityTaskId()).append(",");
        if (getOutpostIdentifier() != null)
            sb.append("OutpostIdentifier: ").append(getOutpostIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCapacityTaskRequest == false)
            return false;
        GetCapacityTaskRequest other = (GetCapacityTaskRequest) obj;
        if (other.getCapacityTaskId() == null ^ this.getCapacityTaskId() == null)
            return false;
        if (other.getCapacityTaskId() != null && other.getCapacityTaskId().equals(this.getCapacityTaskId()) == false)
            return false;
        if (other.getOutpostIdentifier() == null ^ this.getOutpostIdentifier() == null)
            return false;
        if (other.getOutpostIdentifier() != null && other.getOutpostIdentifier().equals(this.getOutpostIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityTaskId() == null) ? 0 : getCapacityTaskId().hashCode());
        hashCode = prime * hashCode + ((getOutpostIdentifier() == null) ? 0 : getOutpostIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public GetCapacityTaskRequest clone() {
        return (GetCapacityTaskRequest) super.clone();
    }

}
