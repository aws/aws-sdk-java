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
package com.amazonaws.services.config.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeletePendingAggregationRequest"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePendingAggregationRequestRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The 12-digit account ID of the account requesting to aggregate data.
     * </p>
     */
    private String requesterAccountId;
    /**
     * <p>
     * The region requesting to aggregate data.
     * </p>
     */
    private String requesterAwsRegion;

    /**
     * <p>
     * The 12-digit account ID of the account requesting to aggregate data.
     * </p>
     * 
     * @param requesterAccountId
     *        The 12-digit account ID of the account requesting to aggregate data.
     */

    public void setRequesterAccountId(String requesterAccountId) {
        this.requesterAccountId = requesterAccountId;
    }

    /**
     * <p>
     * The 12-digit account ID of the account requesting to aggregate data.
     * </p>
     * 
     * @return The 12-digit account ID of the account requesting to aggregate data.
     */

    public String getRequesterAccountId() {
        return this.requesterAccountId;
    }

    /**
     * <p>
     * The 12-digit account ID of the account requesting to aggregate data.
     * </p>
     * 
     * @param requesterAccountId
     *        The 12-digit account ID of the account requesting to aggregate data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePendingAggregationRequestRequest withRequesterAccountId(String requesterAccountId) {
        setRequesterAccountId(requesterAccountId);
        return this;
    }

    /**
     * <p>
     * The region requesting to aggregate data.
     * </p>
     * 
     * @param requesterAwsRegion
     *        The region requesting to aggregate data.
     */

    public void setRequesterAwsRegion(String requesterAwsRegion) {
        this.requesterAwsRegion = requesterAwsRegion;
    }

    /**
     * <p>
     * The region requesting to aggregate data.
     * </p>
     * 
     * @return The region requesting to aggregate data.
     */

    public String getRequesterAwsRegion() {
        return this.requesterAwsRegion;
    }

    /**
     * <p>
     * The region requesting to aggregate data.
     * </p>
     * 
     * @param requesterAwsRegion
     *        The region requesting to aggregate data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePendingAggregationRequestRequest withRequesterAwsRegion(String requesterAwsRegion) {
        setRequesterAwsRegion(requesterAwsRegion);
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
        if (getRequesterAccountId() != null)
            sb.append("RequesterAccountId: ").append(getRequesterAccountId()).append(",");
        if (getRequesterAwsRegion() != null)
            sb.append("RequesterAwsRegion: ").append(getRequesterAwsRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePendingAggregationRequestRequest == false)
            return false;
        DeletePendingAggregationRequestRequest other = (DeletePendingAggregationRequestRequest) obj;
        if (other.getRequesterAccountId() == null ^ this.getRequesterAccountId() == null)
            return false;
        if (other.getRequesterAccountId() != null && other.getRequesterAccountId().equals(this.getRequesterAccountId()) == false)
            return false;
        if (other.getRequesterAwsRegion() == null ^ this.getRequesterAwsRegion() == null)
            return false;
        if (other.getRequesterAwsRegion() != null && other.getRequesterAwsRegion().equals(this.getRequesterAwsRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequesterAccountId() == null) ? 0 : getRequesterAccountId().hashCode());
        hashCode = prime * hashCode + ((getRequesterAwsRegion() == null) ? 0 : getRequesterAwsRegion().hashCode());
        return hashCode;
    }

    @Override
    public DeletePendingAggregationRequestRequest clone() {
        return (DeletePendingAggregationRequestRequest) super.clone();
    }

}
