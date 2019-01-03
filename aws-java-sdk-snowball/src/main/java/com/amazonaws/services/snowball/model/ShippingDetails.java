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
package com.amazonaws.services.snowball.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A job's shipping information, including inbound and outbound tracking numbers and shipping speed options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/snowball-2016-06-30/ShippingDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ShippingDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The shipping speed for a particular job. This speed doesn't dictate how soon you'll get the Snowball from the
     * job's creation date. This speed represents how quickly it moves to its destination while in transit. Regional
     * shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in about a
     * day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the United States of America (US), you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     */
    private String shippingOption;
    /**
     * <p>
     * The <code>Status</code> and <code>TrackingNumber</code> values for a Snowball being returned to AWS for a
     * particular job.
     * </p>
     */
    private Shipment inboundShipment;
    /**
     * <p>
     * The <code>Status</code> and <code>TrackingNumber</code> values for a Snowball being delivered to the address that
     * you specified for a particular job.
     * </p>
     */
    private Shipment outboundShipment;

    /**
     * <p>
     * The shipping speed for a particular job. This speed doesn't dictate how soon you'll get the Snowball from the
     * job's creation date. This speed represents how quickly it moves to its destination while in transit. Regional
     * shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in about a
     * day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the United States of America (US), you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * 
     * @param shippingOption
     *        The shipping speed for a particular job. This speed doesn't dictate how soon you'll get the Snowball from
     *        the job's creation date. This speed represents how quickly it moves to its destination while in transit.
     *        Regional shipping speeds are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in
     *        about a day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     *        delivered in about a day. In addition, most countries in the EU have access to standard shipping, which
     *        typically takes less than a week, one way.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In India, Snowballs are delivered in one to seven days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the United States of America (US), you have access to one-day shipping and two-day shipping.
     *        </p>
     *        </li>
     * @see ShippingOption
     */

    public void setShippingOption(String shippingOption) {
        this.shippingOption = shippingOption;
    }

    /**
     * <p>
     * The shipping speed for a particular job. This speed doesn't dictate how soon you'll get the Snowball from the
     * job's creation date. This speed represents how quickly it moves to its destination while in transit. Regional
     * shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in about a
     * day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the United States of America (US), you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The shipping speed for a particular job. This speed doesn't dictate how soon you'll get the Snowball from
     *         the job's creation date. This speed represents how quickly it moves to its destination while in transit.
     *         Regional shipping speeds are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in
     *         about a day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     *         delivered in about a day. In addition, most countries in the EU have access to standard shipping, which
     *         typically takes less than a week, one way.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In India, Snowballs are delivered in one to seven days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         In the United States of America (US), you have access to one-day shipping and two-day shipping.
     *         </p>
     *         </li>
     * @see ShippingOption
     */

    public String getShippingOption() {
        return this.shippingOption;
    }

    /**
     * <p>
     * The shipping speed for a particular job. This speed doesn't dictate how soon you'll get the Snowball from the
     * job's creation date. This speed represents how quickly it moves to its destination while in transit. Regional
     * shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in about a
     * day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the United States of America (US), you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * 
     * @param shippingOption
     *        The shipping speed for a particular job. This speed doesn't dictate how soon you'll get the Snowball from
     *        the job's creation date. This speed represents how quickly it moves to its destination while in transit.
     *        Regional shipping speeds are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in
     *        about a day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     *        delivered in about a day. In addition, most countries in the EU have access to standard shipping, which
     *        typically takes less than a week, one way.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In India, Snowballs are delivered in one to seven days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the United States of America (US), you have access to one-day shipping and two-day shipping.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShippingOption
     */

    public ShippingDetails withShippingOption(String shippingOption) {
        setShippingOption(shippingOption);
        return this;
    }

    /**
     * <p>
     * The shipping speed for a particular job. This speed doesn't dictate how soon you'll get the Snowball from the
     * job's creation date. This speed represents how quickly it moves to its destination while in transit. Regional
     * shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in about a
     * day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the United States of America (US), you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * 
     * @param shippingOption
     *        The shipping speed for a particular job. This speed doesn't dictate how soon you'll get the Snowball from
     *        the job's creation date. This speed represents how quickly it moves to its destination while in transit.
     *        Regional shipping speeds are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in
     *        about a day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     *        delivered in about a day. In addition, most countries in the EU have access to standard shipping, which
     *        typically takes less than a week, one way.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In India, Snowballs are delivered in one to seven days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the United States of America (US), you have access to one-day shipping and two-day shipping.
     *        </p>
     *        </li>
     * @see ShippingOption
     */

    public void setShippingOption(ShippingOption shippingOption) {
        withShippingOption(shippingOption);
    }

    /**
     * <p>
     * The shipping speed for a particular job. This speed doesn't dictate how soon you'll get the Snowball from the
     * job's creation date. This speed represents how quickly it moves to its destination while in transit. Regional
     * shipping speeds are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in about a
     * day.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     * delivered in about a day. In addition, most countries in the EU have access to standard shipping, which typically
     * takes less than a week, one way.
     * </p>
     * </li>
     * <li>
     * <p>
     * In India, Snowballs are delivered in one to seven days.
     * </p>
     * </li>
     * <li>
     * <p>
     * In the United States of America (US), you have access to one-day shipping and two-day shipping.
     * </p>
     * </li>
     * </ul>
     * 
     * @param shippingOption
     *        The shipping speed for a particular job. This speed doesn't dictate how soon you'll get the Snowball from
     *        the job's creation date. This speed represents how quickly it moves to its destination while in transit.
     *        Regional shipping speeds are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        In Australia, you have access to express shipping. Typically, Snowballs shipped express are delivered in
     *        about a day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the European Union (EU), you have access to express shipping. Typically, Snowballs shipped express are
     *        delivered in about a day. In addition, most countries in the EU have access to standard shipping, which
     *        typically takes less than a week, one way.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In India, Snowballs are delivered in one to seven days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        In the United States of America (US), you have access to one-day shipping and two-day shipping.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ShippingOption
     */

    public ShippingDetails withShippingOption(ShippingOption shippingOption) {
        this.shippingOption = shippingOption.toString();
        return this;
    }

    /**
     * <p>
     * The <code>Status</code> and <code>TrackingNumber</code> values for a Snowball being returned to AWS for a
     * particular job.
     * </p>
     * 
     * @param inboundShipment
     *        The <code>Status</code> and <code>TrackingNumber</code> values for a Snowball being returned to AWS for a
     *        particular job.
     */

    public void setInboundShipment(Shipment inboundShipment) {
        this.inboundShipment = inboundShipment;
    }

    /**
     * <p>
     * The <code>Status</code> and <code>TrackingNumber</code> values for a Snowball being returned to AWS for a
     * particular job.
     * </p>
     * 
     * @return The <code>Status</code> and <code>TrackingNumber</code> values for a Snowball being returned to AWS for a
     *         particular job.
     */

    public Shipment getInboundShipment() {
        return this.inboundShipment;
    }

    /**
     * <p>
     * The <code>Status</code> and <code>TrackingNumber</code> values for a Snowball being returned to AWS for a
     * particular job.
     * </p>
     * 
     * @param inboundShipment
     *        The <code>Status</code> and <code>TrackingNumber</code> values for a Snowball being returned to AWS for a
     *        particular job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShippingDetails withInboundShipment(Shipment inboundShipment) {
        setInboundShipment(inboundShipment);
        return this;
    }

    /**
     * <p>
     * The <code>Status</code> and <code>TrackingNumber</code> values for a Snowball being delivered to the address that
     * you specified for a particular job.
     * </p>
     * 
     * @param outboundShipment
     *        The <code>Status</code> and <code>TrackingNumber</code> values for a Snowball being delivered to the
     *        address that you specified for a particular job.
     */

    public void setOutboundShipment(Shipment outboundShipment) {
        this.outboundShipment = outboundShipment;
    }

    /**
     * <p>
     * The <code>Status</code> and <code>TrackingNumber</code> values for a Snowball being delivered to the address that
     * you specified for a particular job.
     * </p>
     * 
     * @return The <code>Status</code> and <code>TrackingNumber</code> values for a Snowball being delivered to the
     *         address that you specified for a particular job.
     */

    public Shipment getOutboundShipment() {
        return this.outboundShipment;
    }

    /**
     * <p>
     * The <code>Status</code> and <code>TrackingNumber</code> values for a Snowball being delivered to the address that
     * you specified for a particular job.
     * </p>
     * 
     * @param outboundShipment
     *        The <code>Status</code> and <code>TrackingNumber</code> values for a Snowball being delivered to the
     *        address that you specified for a particular job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ShippingDetails withOutboundShipment(Shipment outboundShipment) {
        setOutboundShipment(outboundShipment);
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
        if (getShippingOption() != null)
            sb.append("ShippingOption: ").append(getShippingOption()).append(",");
        if (getInboundShipment() != null)
            sb.append("InboundShipment: ").append(getInboundShipment()).append(",");
        if (getOutboundShipment() != null)
            sb.append("OutboundShipment: ").append(getOutboundShipment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ShippingDetails == false)
            return false;
        ShippingDetails other = (ShippingDetails) obj;
        if (other.getShippingOption() == null ^ this.getShippingOption() == null)
            return false;
        if (other.getShippingOption() != null && other.getShippingOption().equals(this.getShippingOption()) == false)
            return false;
        if (other.getInboundShipment() == null ^ this.getInboundShipment() == null)
            return false;
        if (other.getInboundShipment() != null && other.getInboundShipment().equals(this.getInboundShipment()) == false)
            return false;
        if (other.getOutboundShipment() == null ^ this.getOutboundShipment() == null)
            return false;
        if (other.getOutboundShipment() != null && other.getOutboundShipment().equals(this.getOutboundShipment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getShippingOption() == null) ? 0 : getShippingOption().hashCode());
        hashCode = prime * hashCode + ((getInboundShipment() == null) ? 0 : getInboundShipment().hashCode());
        hashCode = prime * hashCode + ((getOutboundShipment() == null) ? 0 : getOutboundShipment().hashCode());
        return hashCode;
    }

    @Override
    public ShippingDetails clone() {
        try {
            return (ShippingDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.snowball.model.transform.ShippingDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
