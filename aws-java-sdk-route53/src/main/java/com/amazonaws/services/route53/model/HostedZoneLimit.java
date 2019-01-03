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

/**
 * <p>
 * A complex type that contains the type of limit that you specified in the request and the current value for that
 * limit.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/HostedZoneLimit" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HostedZoneLimit implements Serializable, Cloneable {

    /**
     * <p>
     * The limit that you requested. Valid values include the following:
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
     * The current value for the limit that is specified by <code>Type</code>.
     * </p>
     */
    private Long value;

    /**
     * <p>
     * The limit that you requested. Valid values include the following:
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
     *        The limit that you requested. Valid values include the following:</p>
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
     * The limit that you requested. Valid values include the following:
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
     * @return The limit that you requested. Valid values include the following:</p>
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
     * The limit that you requested. Valid values include the following:
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
     *        The limit that you requested. Valid values include the following:</p>
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

    public HostedZoneLimit withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The limit that you requested. Valid values include the following:
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
     *        The limit that you requested. Valid values include the following:</p>
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

    public HostedZoneLimit withType(HostedZoneLimitType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The current value for the limit that is specified by <code>Type</code>.
     * </p>
     * 
     * @param value
     *        The current value for the limit that is specified by <code>Type</code>.
     */

    public void setValue(Long value) {
        this.value = value;
    }

    /**
     * <p>
     * The current value for the limit that is specified by <code>Type</code>.
     * </p>
     * 
     * @return The current value for the limit that is specified by <code>Type</code>.
     */

    public Long getValue() {
        return this.value;
    }

    /**
     * <p>
     * The current value for the limit that is specified by <code>Type</code>.
     * </p>
     * 
     * @param value
     *        The current value for the limit that is specified by <code>Type</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HostedZoneLimit withValue(Long value) {
        setValue(value);
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostedZoneLimit == false)
            return false;
        HostedZoneLimit other = (HostedZoneLimit) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public HostedZoneLimit clone() {
        try {
            return (HostedZoneLimit) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
