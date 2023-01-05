/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about traffic distribution groups.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TrafficDistributionGroupSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrafficDistributionGroupSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the
     * Region where the traffic distribution group was created. The ARN must be provided if the call is from the
     * replicated Region.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the traffic distribution group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * The status of the traffic distribution group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATION_IN_PROGRESS</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_FAILED</code> indicates that the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETION_FAILED</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     * >UpdateTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the
     * Region where the traffic distribution group was created. The ARN must be provided if the call is from the
     * replicated Region.
     * </p>
     * 
     * @param id
     *        The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called
     *        in the Region where the traffic distribution group was created. The ARN must be provided if the call is
     *        from the replicated Region.
     */

    public void setId(String id) {
        this.id = id;
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

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called in the
     * Region where the traffic distribution group was created. The ARN must be provided if the call is from the
     * replicated Region.
     * </p>
     * 
     * @param id
     *        The identifier of the traffic distribution group. This can be the ID or the ARN if the API is being called
     *        in the Region where the traffic distribution group was created. The ARN must be provided if the call is
     *        from the replicated Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficDistributionGroupSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the traffic distribution group.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the traffic distribution group.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the traffic distribution group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficDistributionGroupSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the traffic distribution group.
     * </p>
     * 
     * @param name
     *        The name of the traffic distribution group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the traffic distribution group.
     * </p>
     * 
     * @return The name of the traffic distribution group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the traffic distribution group.
     * </p>
     * 
     * @param name
     *        The name of the traffic distribution group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficDistributionGroupSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     * 
     * @param instanceArn
     *        The Amazon Resource Name (ARN) of the traffic distribution group.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the traffic distribution group.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the traffic distribution group.
     * </p>
     * 
     * @param instanceArn
     *        The Amazon Resource Name (ARN) of the traffic distribution group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrafficDistributionGroupSummary withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * The status of the traffic distribution group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATION_IN_PROGRESS</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_FAILED</code> indicates that the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETION_FAILED</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     * >UpdateTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the traffic distribution group. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATION_IN_PROGRESS</code> means the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *        >CreateTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> means the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *        >CreateTrafficDistributionGroup</a> operation has succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATION_FAILED</code> indicates that the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *        >CreateTrafficDistributionGroup</a> operation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_DELETION</code> means the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     *        >DeleteTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETION_FAILED</code> means the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     *        >DeleteTrafficDistributionGroup</a> operation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code> means the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     *        >UpdateTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     *        </p>
     *        </li>
     * @see TrafficDistributionGroupStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the traffic distribution group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATION_IN_PROGRESS</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_FAILED</code> indicates that the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETION_FAILED</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     * >UpdateTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the traffic distribution group. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATION_IN_PROGRESS</code> means the previous <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *         >CreateTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code> means the previous <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *         >CreateTrafficDistributionGroup</a> operation has succeeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATION_FAILED</code> indicates that the previous <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *         >CreateTrafficDistributionGroup</a> operation has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING_DELETION</code> means the previous <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     *         >DeleteTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETION_FAILED</code> means the previous <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     *         >DeleteTrafficDistributionGroup</a> operation has failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UPDATE_IN_PROGRESS</code> means the previous <a
     *         href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     *         >UpdateTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     *         </p>
     *         </li>
     * @see TrafficDistributionGroupStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the traffic distribution group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATION_IN_PROGRESS</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_FAILED</code> indicates that the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETION_FAILED</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     * >UpdateTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the traffic distribution group. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATION_IN_PROGRESS</code> means the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *        >CreateTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> means the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *        >CreateTrafficDistributionGroup</a> operation has succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATION_FAILED</code> indicates that the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *        >CreateTrafficDistributionGroup</a> operation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_DELETION</code> means the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     *        >DeleteTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETION_FAILED</code> means the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     *        >DeleteTrafficDistributionGroup</a> operation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code> means the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     *        >UpdateTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficDistributionGroupStatus
     */

    public TrafficDistributionGroupSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the traffic distribution group.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATION_IN_PROGRESS</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ACTIVE</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has succeeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATION_FAILED</code> indicates that the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     * >CreateTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING_DELETION</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETION_FAILED</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     * >DeleteTrafficDistributionGroup</a> operation has failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UPDATE_IN_PROGRESS</code> means the previous <a
     * href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     * >UpdateTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the traffic distribution group. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATION_IN_PROGRESS</code> means the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *        >CreateTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code> means the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *        >CreateTrafficDistributionGroup</a> operation has succeeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATION_FAILED</code> indicates that the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_CreateTrafficDistributionGroup.html"
     *        >CreateTrafficDistributionGroup</a> operation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING_DELETION</code> means the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     *        >DeleteTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETION_FAILED</code> means the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_DeleteTrafficDistributionGroup.html"
     *        >DeleteTrafficDistributionGroup</a> operation has failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UPDATE_IN_PROGRESS</code> means the previous <a
     *        href="https://docs.aws.amazon.com/connect/latest/APIReference/API_UpdateTrafficDistributionGroup.html"
     *        >UpdateTrafficDistributionGroup</a> operation is still in progress and has not yet completed.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrafficDistributionGroupStatus
     */

    public TrafficDistributionGroupSummary withStatus(TrafficDistributionGroupStatus status) {
        this.status = status.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrafficDistributionGroupSummary == false)
            return false;
        TrafficDistributionGroupSummary other = (TrafficDistributionGroupSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public TrafficDistributionGroupSummary clone() {
        try {
            return (TrafficDistributionGroupSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.TrafficDistributionGroupSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
