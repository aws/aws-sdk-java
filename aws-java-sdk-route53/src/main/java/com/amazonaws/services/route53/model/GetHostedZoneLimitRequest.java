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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetHostedZoneLimit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetHostedZoneLimitRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The limit that you want to get. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that you can create in the specified hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of Amazon VPCs that you can associate with the specified
     * private hosted zone.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * The ID of the hosted zone that you want to get a limit for.
     * </p>
     */
    private String hostedZoneId;

    /**
     * <p>
     * The limit that you want to get. Valid values include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that you can create in the specified hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of Amazon VPCs that you can associate with the specified
     * private hosted zone.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The limit that you want to get. Valid values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that you can create in the specified hosted zone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of Amazon VPCs that you can associate with the
     *        specified private hosted zone.
     *        </p>
     *        </li>
     * @see HostedZoneLimitType
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
     * <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that you can create in the specified hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of Amazon VPCs that you can associate with the specified
     * private hosted zone.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The limit that you want to get. Valid values include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that you can create in the specified hosted
     *         zone.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of Amazon VPCs that you can associate with the
     *         specified private hosted zone.
     *         </p>
     *         </li>
     * @see HostedZoneLimitType
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
     * <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that you can create in the specified hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of Amazon VPCs that you can associate with the specified
     * private hosted zone.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The limit that you want to get. Valid values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that you can create in the specified hosted zone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of Amazon VPCs that you can associate with the
     *        specified private hosted zone.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostedZoneLimitType
     */

    public GetHostedZoneLimitRequest withType(String type) {
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
     * <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that you can create in the specified hosted zone.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of Amazon VPCs that you can associate with the specified
     * private hosted zone.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The limit that you want to get. Valid values include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>MAX_RRSETS_BY_ZONE</b>: The maximum number of records that you can create in the specified hosted zone.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>MAX_VPCS_ASSOCIATED_BY_ZONE</b>: The maximum number of Amazon VPCs that you can associate with the
     *        specified private hosted zone.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HostedZoneLimitType
     */

    public GetHostedZoneLimitRequest withType(HostedZoneLimitType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the hosted zone that you want to get a limit for.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that you want to get a limit for.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you want to get a limit for.
     * </p>
     * 
     * @return The ID of the hosted zone that you want to get a limit for.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that you want to get a limit for.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that you want to get a limit for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetHostedZoneLimitRequest withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
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
            sb.append("Type: ").append(getType()).append(",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHostedZoneLimitRequest == false)
            return false;
        GetHostedZoneLimitRequest other = (GetHostedZoneLimitRequest) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        return hashCode;
    }

    @Override
    public GetHostedZoneLimitRequest clone() {
        return (GetHostedZoneLimitRequest) super.clone();
    }

}
