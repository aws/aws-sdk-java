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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/ListAssociatedRoute53HealthChecks"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssociatedRoute53HealthChecksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Identifiers for the health checks.
     * </p>
     */
    private java.util.List<String> healthCheckIds;
    /**
     * <p>
     * Next token for listing health checks.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Identifiers for the health checks.
     * </p>
     * 
     * @return Identifiers for the health checks.
     */

    public java.util.List<String> getHealthCheckIds() {
        return healthCheckIds;
    }

    /**
     * <p>
     * Identifiers for the health checks.
     * </p>
     * 
     * @param healthCheckIds
     *        Identifiers for the health checks.
     */

    public void setHealthCheckIds(java.util.Collection<String> healthCheckIds) {
        if (healthCheckIds == null) {
            this.healthCheckIds = null;
            return;
        }

        this.healthCheckIds = new java.util.ArrayList<String>(healthCheckIds);
    }

    /**
     * <p>
     * Identifiers for the health checks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHealthCheckIds(java.util.Collection)} or {@link #withHealthCheckIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param healthCheckIds
     *        Identifiers for the health checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedRoute53HealthChecksResult withHealthCheckIds(String... healthCheckIds) {
        if (this.healthCheckIds == null) {
            setHealthCheckIds(new java.util.ArrayList<String>(healthCheckIds.length));
        }
        for (String ele : healthCheckIds) {
            this.healthCheckIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Identifiers for the health checks.
     * </p>
     * 
     * @param healthCheckIds
     *        Identifiers for the health checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedRoute53HealthChecksResult withHealthCheckIds(java.util.Collection<String> healthCheckIds) {
        setHealthCheckIds(healthCheckIds);
        return this;
    }

    /**
     * <p>
     * Next token for listing health checks.
     * </p>
     * 
     * @param nextToken
     *        Next token for listing health checks.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Next token for listing health checks.
     * </p>
     * 
     * @return Next token for listing health checks.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Next token for listing health checks.
     * </p>
     * 
     * @param nextToken
     *        Next token for listing health checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssociatedRoute53HealthChecksResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getHealthCheckIds() != null)
            sb.append("HealthCheckIds: ").append(getHealthCheckIds()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAssociatedRoute53HealthChecksResult == false)
            return false;
        ListAssociatedRoute53HealthChecksResult other = (ListAssociatedRoute53HealthChecksResult) obj;
        if (other.getHealthCheckIds() == null ^ this.getHealthCheckIds() == null)
            return false;
        if (other.getHealthCheckIds() != null && other.getHealthCheckIds().equals(this.getHealthCheckIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHealthCheckIds() == null) ? 0 : getHealthCheckIds().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAssociatedRoute53HealthChecksResult clone() {
        try {
            return (ListAssociatedRoute53HealthChecksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
