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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Fleet designated in a game session queue. Requests for new game sessions in the queue are fulfilled by starting a new
 * game session on any destination configured for a queue.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateGameSessionQueue</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessionQueues</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateGameSessionQueue</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteGameSessionQueue</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GameSessionQueueDestination"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameSessionQueueDestination implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Amazon Resource Name (ARN) assigned to fleet or fleet alias. ARNs, which include a fleet ID or alias ID and a
     * region name, provide a unique identifier across all regions.
     * </p>
     */
    private String destinationArn;

    /**
     * <p>
     * Amazon Resource Name (ARN) assigned to fleet or fleet alias. ARNs, which include a fleet ID or alias ID and a
     * region name, provide a unique identifier across all regions.
     * </p>
     * 
     * @param destinationArn
     *        Amazon Resource Name (ARN) assigned to fleet or fleet alias. ARNs, which include a fleet ID or alias ID
     *        and a region name, provide a unique identifier across all regions.
     */

    public void setDestinationArn(String destinationArn) {
        this.destinationArn = destinationArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) assigned to fleet or fleet alias. ARNs, which include a fleet ID or alias ID and a
     * region name, provide a unique identifier across all regions.
     * </p>
     * 
     * @return Amazon Resource Name (ARN) assigned to fleet or fleet alias. ARNs, which include a fleet ID or alias ID
     *         and a region name, provide a unique identifier across all regions.
     */

    public String getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * <p>
     * Amazon Resource Name (ARN) assigned to fleet or fleet alias. ARNs, which include a fleet ID or alias ID and a
     * region name, provide a unique identifier across all regions.
     * </p>
     * 
     * @param destinationArn
     *        Amazon Resource Name (ARN) assigned to fleet or fleet alias. ARNs, which include a fleet ID or alias ID
     *        and a region name, provide a unique identifier across all regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionQueueDestination withDestinationArn(String destinationArn) {
        setDestinationArn(destinationArn);
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
        if (getDestinationArn() != null)
            sb.append("DestinationArn: ").append(getDestinationArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GameSessionQueueDestination == false)
            return false;
        GameSessionQueueDestination other = (GameSessionQueueDestination) obj;
        if (other.getDestinationArn() == null ^ this.getDestinationArn() == null)
            return false;
        if (other.getDestinationArn() != null && other.getDestinationArn().equals(this.getDestinationArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestinationArn() == null) ? 0 : getDestinationArn().hashCode());
        return hashCode;
    }

    @Override
    public GameSessionQueueDestination clone() {
        try {
            return (GameSessionQueueDestination) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.GameSessionQueueDestinationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
