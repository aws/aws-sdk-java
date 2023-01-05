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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/UpdateSubscriptionsToEventBridge"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSubscriptionsToEventBridgeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * When set to true, this operation migrates DMS subscriptions for Amazon SNS notifications no matter what your
     * replication instance version is. If not set or set to false, this operation runs only when all your replication
     * instances are from DMS version 3.4.6 or higher.
     * </p>
     */
    private Boolean forceMove;

    /**
     * <p>
     * When set to true, this operation migrates DMS subscriptions for Amazon SNS notifications no matter what your
     * replication instance version is. If not set or set to false, this operation runs only when all your replication
     * instances are from DMS version 3.4.6 or higher.
     * </p>
     * 
     * @param forceMove
     *        When set to true, this operation migrates DMS subscriptions for Amazon SNS notifications no matter what
     *        your replication instance version is. If not set or set to false, this operation runs only when all your
     *        replication instances are from DMS version 3.4.6 or higher.
     */

    public void setForceMove(Boolean forceMove) {
        this.forceMove = forceMove;
    }

    /**
     * <p>
     * When set to true, this operation migrates DMS subscriptions for Amazon SNS notifications no matter what your
     * replication instance version is. If not set or set to false, this operation runs only when all your replication
     * instances are from DMS version 3.4.6 or higher.
     * </p>
     * 
     * @return When set to true, this operation migrates DMS subscriptions for Amazon SNS notifications no matter what
     *         your replication instance version is. If not set or set to false, this operation runs only when all your
     *         replication instances are from DMS version 3.4.6 or higher.
     */

    public Boolean getForceMove() {
        return this.forceMove;
    }

    /**
     * <p>
     * When set to true, this operation migrates DMS subscriptions for Amazon SNS notifications no matter what your
     * replication instance version is. If not set or set to false, this operation runs only when all your replication
     * instances are from DMS version 3.4.6 or higher.
     * </p>
     * 
     * @param forceMove
     *        When set to true, this operation migrates DMS subscriptions for Amazon SNS notifications no matter what
     *        your replication instance version is. If not set or set to false, this operation runs only when all your
     *        replication instances are from DMS version 3.4.6 or higher.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSubscriptionsToEventBridgeRequest withForceMove(Boolean forceMove) {
        setForceMove(forceMove);
        return this;
    }

    /**
     * <p>
     * When set to true, this operation migrates DMS subscriptions for Amazon SNS notifications no matter what your
     * replication instance version is. If not set or set to false, this operation runs only when all your replication
     * instances are from DMS version 3.4.6 or higher.
     * </p>
     * 
     * @return When set to true, this operation migrates DMS subscriptions for Amazon SNS notifications no matter what
     *         your replication instance version is. If not set or set to false, this operation runs only when all your
     *         replication instances are from DMS version 3.4.6 or higher.
     */

    public Boolean isForceMove() {
        return this.forceMove;
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
        if (getForceMove() != null)
            sb.append("ForceMove: ").append(getForceMove());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSubscriptionsToEventBridgeRequest == false)
            return false;
        UpdateSubscriptionsToEventBridgeRequest other = (UpdateSubscriptionsToEventBridgeRequest) obj;
        if (other.getForceMove() == null ^ this.getForceMove() == null)
            return false;
        if (other.getForceMove() != null && other.getForceMove().equals(this.getForceMove()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForceMove() == null) ? 0 : getForceMove().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSubscriptionsToEventBridgeRequest clone() {
        return (UpdateSubscriptionsToEventBridgeRequest) super.clone();
    }

}
