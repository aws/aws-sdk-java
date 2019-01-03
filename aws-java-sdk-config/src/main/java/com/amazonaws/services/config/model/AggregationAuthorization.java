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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that represents the authorizations granted to aggregator accounts and regions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/AggregationAuthorization" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregationAuthorization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the aggregation object.
     * </p>
     */
    private String aggregationAuthorizationArn;
    /**
     * <p>
     * The 12-digit account ID of the account authorized to aggregate data.
     * </p>
     */
    private String authorizedAccountId;
    /**
     * <p>
     * The region authorized to collect aggregated data.
     * </p>
     */
    private String authorizedAwsRegion;
    /**
     * <p>
     * The time stamp when the aggregation authorization was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the aggregation object.
     * </p>
     * 
     * @param aggregationAuthorizationArn
     *        The Amazon Resource Name (ARN) of the aggregation object.
     */

    public void setAggregationAuthorizationArn(String aggregationAuthorizationArn) {
        this.aggregationAuthorizationArn = aggregationAuthorizationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the aggregation object.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the aggregation object.
     */

    public String getAggregationAuthorizationArn() {
        return this.aggregationAuthorizationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the aggregation object.
     * </p>
     * 
     * @param aggregationAuthorizationArn
     *        The Amazon Resource Name (ARN) of the aggregation object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationAuthorization withAggregationAuthorizationArn(String aggregationAuthorizationArn) {
        setAggregationAuthorizationArn(aggregationAuthorizationArn);
        return this;
    }

    /**
     * <p>
     * The 12-digit account ID of the account authorized to aggregate data.
     * </p>
     * 
     * @param authorizedAccountId
     *        The 12-digit account ID of the account authorized to aggregate data.
     */

    public void setAuthorizedAccountId(String authorizedAccountId) {
        this.authorizedAccountId = authorizedAccountId;
    }

    /**
     * <p>
     * The 12-digit account ID of the account authorized to aggregate data.
     * </p>
     * 
     * @return The 12-digit account ID of the account authorized to aggregate data.
     */

    public String getAuthorizedAccountId() {
        return this.authorizedAccountId;
    }

    /**
     * <p>
     * The 12-digit account ID of the account authorized to aggregate data.
     * </p>
     * 
     * @param authorizedAccountId
     *        The 12-digit account ID of the account authorized to aggregate data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationAuthorization withAuthorizedAccountId(String authorizedAccountId) {
        setAuthorizedAccountId(authorizedAccountId);
        return this;
    }

    /**
     * <p>
     * The region authorized to collect aggregated data.
     * </p>
     * 
     * @param authorizedAwsRegion
     *        The region authorized to collect aggregated data.
     */

    public void setAuthorizedAwsRegion(String authorizedAwsRegion) {
        this.authorizedAwsRegion = authorizedAwsRegion;
    }

    /**
     * <p>
     * The region authorized to collect aggregated data.
     * </p>
     * 
     * @return The region authorized to collect aggregated data.
     */

    public String getAuthorizedAwsRegion() {
        return this.authorizedAwsRegion;
    }

    /**
     * <p>
     * The region authorized to collect aggregated data.
     * </p>
     * 
     * @param authorizedAwsRegion
     *        The region authorized to collect aggregated data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationAuthorization withAuthorizedAwsRegion(String authorizedAwsRegion) {
        setAuthorizedAwsRegion(authorizedAwsRegion);
        return this;
    }

    /**
     * <p>
     * The time stamp when the aggregation authorization was created.
     * </p>
     * 
     * @param creationTime
     *        The time stamp when the aggregation authorization was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time stamp when the aggregation authorization was created.
     * </p>
     * 
     * @return The time stamp when the aggregation authorization was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time stamp when the aggregation authorization was created.
     * </p>
     * 
     * @param creationTime
     *        The time stamp when the aggregation authorization was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregationAuthorization withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getAggregationAuthorizationArn() != null)
            sb.append("AggregationAuthorizationArn: ").append(getAggregationAuthorizationArn()).append(",");
        if (getAuthorizedAccountId() != null)
            sb.append("AuthorizedAccountId: ").append(getAuthorizedAccountId()).append(",");
        if (getAuthorizedAwsRegion() != null)
            sb.append("AuthorizedAwsRegion: ").append(getAuthorizedAwsRegion()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregationAuthorization == false)
            return false;
        AggregationAuthorization other = (AggregationAuthorization) obj;
        if (other.getAggregationAuthorizationArn() == null ^ this.getAggregationAuthorizationArn() == null)
            return false;
        if (other.getAggregationAuthorizationArn() != null && other.getAggregationAuthorizationArn().equals(this.getAggregationAuthorizationArn()) == false)
            return false;
        if (other.getAuthorizedAccountId() == null ^ this.getAuthorizedAccountId() == null)
            return false;
        if (other.getAuthorizedAccountId() != null && other.getAuthorizedAccountId().equals(this.getAuthorizedAccountId()) == false)
            return false;
        if (other.getAuthorizedAwsRegion() == null ^ this.getAuthorizedAwsRegion() == null)
            return false;
        if (other.getAuthorizedAwsRegion() != null && other.getAuthorizedAwsRegion().equals(this.getAuthorizedAwsRegion()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAggregationAuthorizationArn() == null) ? 0 : getAggregationAuthorizationArn().hashCode());
        hashCode = prime * hashCode + ((getAuthorizedAccountId() == null) ? 0 : getAuthorizedAccountId().hashCode());
        hashCode = prime * hashCode + ((getAuthorizedAwsRegion() == null) ? 0 : getAuthorizedAwsRegion().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public AggregationAuthorization clone() {
        try {
            return (AggregationAuthorization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.config.model.transform.AggregationAuthorizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
