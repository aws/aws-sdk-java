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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type that contains information about the request to create a hosted zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetAccountLimit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccountLimitRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The limit that you want to get. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of health checks that you can create using the current
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted zones that you can create using the current
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum number of reusable delegation sets that you can create
     * using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of traffic policies that you can create using the
     * current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum number of traffic policy instances that you can create
     * using the current account. (Traffic policy instances are referred to as traffic flow policy records in the Amazon
     * Route 53 console.)
     * </p>
     * </li>
     * </ul>
     */
    private String type;

    /**
     * <p>
     * The limit that you want to get. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of health checks that you can create using the current
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted zones that you can create using the current
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum number of reusable delegation sets that you can create
     * using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of traffic policies that you can create using the
     * current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum number of traffic policy instances that you can create
     * using the current account. (Traffic policy instances are referred to as traffic flow policy records in the Amazon
     * Route 53 console.)
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The limit that you want to get. Valid values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of health checks that you can create using the
     *        current account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted zones that you can create using the current
     *        account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum number of reusable delegation sets that you can
     *        create using the current account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of traffic policies that you can create using the
     *        current account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum number of traffic policy instances that you can
     *        create using the current account. (Traffic policy instances are referred to as traffic flow policy records
     *        in the Amazon Route 53 console.)
     *        </p>
     *        </li>
     * @see AccountLimitType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The limit that you want to get. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of health checks that you can create using the current
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted zones that you can create using the current
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum number of reusable delegation sets that you can create
     * using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of traffic policies that you can create using the
     * current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum number of traffic policy instances that you can create
     * using the current account. (Traffic policy instances are referred to as traffic flow policy records in the Amazon
     * Route 53 console.)
     * </p>
     * </li>
     * </ul>
     * 
     * @return The limit that you want to get. Valid values include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of health checks that you can create using the
     *         current account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted zones that you can create using the
     *         current account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum number of reusable delegation sets that you can
     *         create using the current account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of traffic policies that you can create using
     *         the current account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum number of traffic policy instances that you can
     *         create using the current account. (Traffic policy instances are referred to as traffic flow policy
     *         records in the Amazon Route 53 console.)
     *         </p>
     *         </li>
     * @see AccountLimitType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The limit that you want to get. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of health checks that you can create using the current
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted zones that you can create using the current
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum number of reusable delegation sets that you can create
     * using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of traffic policies that you can create using the
     * current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum number of traffic policy instances that you can create
     * using the current account. (Traffic policy instances are referred to as traffic flow policy records in the Amazon
     * Route 53 console.)
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The limit that you want to get. Valid values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of health checks that you can create using the
     *        current account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted zones that you can create using the current
     *        account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum number of reusable delegation sets that you can
     *        create using the current account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of traffic policies that you can create using the
     *        current account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum number of traffic policy instances that you can
     *        create using the current account. (Traffic policy instances are referred to as traffic flow policy records
     *        in the Amazon Route 53 console.)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountLimitType
     */

    public GetAccountLimitRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The limit that you want to get. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of health checks that you can create using the current
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted zones that you can create using the current
     * account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum number of reusable delegation sets that you can create
     * using the current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of traffic policies that you can create using the
     * current account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum number of traffic policy instances that you can create
     * using the current account. (Traffic policy instances are referred to as traffic flow policy records in the Amazon
     * Route 53 console.)
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The limit that you want to get. Valid values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>MAX_HEALTH_CHECKS_BY_OWNER</b>: The maximum number of health checks that you can create using the
     *        current account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MAX_HOSTED_ZONES_BY_OWNER</b>: The maximum number of hosted zones that you can create using the current
     *        account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MAX_REUSABLE_DELEGATION_SETS_BY_OWNER</b>: The maximum number of reusable delegation sets that you can
     *        create using the current account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MAX_TRAFFIC_POLICIES_BY_OWNER</b>: The maximum number of traffic policies that you can create using the
     *        current account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER</b>: The maximum number of traffic policy instances that you can
     *        create using the current account. (Traffic policy instances are referred to as traffic flow policy records
     *        in the Amazon Route 53 console.)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountLimitType
     */

    public GetAccountLimitRequest withType(AccountLimitType type) {
        this.type = type.toString();
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
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccountLimitRequest == false)
            return false;
        GetAccountLimitRequest other = (GetAccountLimitRequest) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public GetAccountLimitRequest clone() {
        return (GetAccountLimitRequest) super.clone();
    }

}
