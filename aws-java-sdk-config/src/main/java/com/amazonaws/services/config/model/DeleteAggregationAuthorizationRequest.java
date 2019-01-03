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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/config-2014-11-12/DeleteAggregationAuthorization"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAggregationAuthorizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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

    public DeleteAggregationAuthorizationRequest withAuthorizedAccountId(String authorizedAccountId) {
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

    public DeleteAggregationAuthorizationRequest withAuthorizedAwsRegion(String authorizedAwsRegion) {
        setAuthorizedAwsRegion(authorizedAwsRegion);
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
        if (getAuthorizedAccountId() != null)
            sb.append("AuthorizedAccountId: ").append(getAuthorizedAccountId()).append(",");
        if (getAuthorizedAwsRegion() != null)
            sb.append("AuthorizedAwsRegion: ").append(getAuthorizedAwsRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAggregationAuthorizationRequest == false)
            return false;
        DeleteAggregationAuthorizationRequest other = (DeleteAggregationAuthorizationRequest) obj;
        if (other.getAuthorizedAccountId() == null ^ this.getAuthorizedAccountId() == null)
            return false;
        if (other.getAuthorizedAccountId() != null && other.getAuthorizedAccountId().equals(this.getAuthorizedAccountId()) == false)
            return false;
        if (other.getAuthorizedAwsRegion() == null ^ this.getAuthorizedAwsRegion() == null)
            return false;
        if (other.getAuthorizedAwsRegion() != null && other.getAuthorizedAwsRegion().equals(this.getAuthorizedAwsRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizedAccountId() == null) ? 0 : getAuthorizedAccountId().hashCode());
        hashCode = prime * hashCode + ((getAuthorizedAwsRegion() == null) ? 0 : getAuthorizedAwsRegion().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAggregationAuthorizationRequest clone() {
        return (DeleteAggregationAuthorizationRequest) super.clone();
    }

}
