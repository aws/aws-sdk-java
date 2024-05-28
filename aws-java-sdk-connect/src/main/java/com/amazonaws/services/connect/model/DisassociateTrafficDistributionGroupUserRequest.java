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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/DisassociateTrafficDistributionGroupUser"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DisassociateTrafficDistributionGroupUserRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the
     * Region where the traffic distribution group was created. The ARN must be provided if the call is from the
     * replicated Region.
     * </p>
     */
    private String trafficDistributionGroupId;
    /**
     * <p>
     * The identifier for the user. This can be the ID or the ARN of the user.
     * </p>
     */
    private String userId;
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     */
    private String instanceId;

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the
     * Region where the traffic distribution group was created. The ARN must be provided if the call is from the
     * replicated Region.
     * </p>
     * 
     * @param trafficDistributionGroupId
     *        The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called
     *        in the Region where the traffic distribution group was created. The ARN must be provided if the call is
     *        from the replicated Region.
     */

    public void setTrafficDistributionGroupId(String trafficDistributionGroupId) {
        this.trafficDistributionGroupId = trafficDistributionGroupId;
    }

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the
     * Region where the traffic distribution group was created. The ARN must be provided if the call is from the
     * replicated Region.
     * </p>
     * 
     * @return The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being
     *         called in the Region where the traffic distribution group was created. The ARN must be provided if the
     *         call is from the replicated Region.
     */

    public String getTrafficDistributionGroupId() {
        return this.trafficDistributionGroupId;
    }

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the
     * Region where the traffic distribution group was created. The ARN must be provided if the call is from the
     * replicated Region.
     * </p>
     * 
     * @param trafficDistributionGroupId
     *        The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called
     *        in the Region where the traffic distribution group was created. The ARN must be provided if the call is
     *        from the replicated Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateTrafficDistributionGroupUserRequest withTrafficDistributionGroupId(String trafficDistributionGroupId) {
        setTrafficDistributionGroupId(trafficDistributionGroupId);
        return this;
    }

    /**
     * <p>
     * The identifier for the user. This can be the ID or the ARN of the user.
     * </p>
     * 
     * @param userId
     *        The identifier for the user. This can be the ID or the ARN of the user.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier for the user. This can be the ID or the ARN of the user.
     * </p>
     * 
     * @return The identifier for the user. This can be the ID or the ARN of the user.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The identifier for the user. This can be the ID or the ARN of the user.
     * </p>
     * 
     * @param userId
     *        The identifier for the user. This can be the ID or the ARN of the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateTrafficDistributionGroupUserRequest withUserId(String userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @return The identifier of the Amazon Connect instance. You can <a
     *         href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *         ID</a> in the Amazon Resource Name (ARN) of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can <a
     * href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance ID</a> in
     * the Amazon Resource Name (ARN) of the instance.
     * </p>
     * 
     * @param instanceId
     *        The identifier of the Amazon Connect instance. You can <a
     *        href="https://docs.aws.amazon.com/connect/latest/adminguide/find-instance-arn.html">find the instance
     *        ID</a> in the Amazon Resource Name (ARN) of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DisassociateTrafficDistributionGroupUserRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
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
        if (getTrafficDistributionGroupId() != null)
            sb.append("TrafficDistributionGroupId: ").append(getTrafficDistributionGroupId()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateTrafficDistributionGroupUserRequest == false)
            return false;
        DisassociateTrafficDistributionGroupUserRequest other = (DisassociateTrafficDistributionGroupUserRequest) obj;
        if (other.getTrafficDistributionGroupId() == null ^ this.getTrafficDistributionGroupId() == null)
            return false;
        if (other.getTrafficDistributionGroupId() != null && other.getTrafficDistributionGroupId().equals(this.getTrafficDistributionGroupId()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTrafficDistributionGroupId() == null) ? 0 : getTrafficDistributionGroupId().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        return hashCode;
    }

    @Override
    public DisassociateTrafficDistributionGroupUserRequest clone() {
        return (DisassociateTrafficDistributionGroupUserRequest) super.clone();
    }

}
