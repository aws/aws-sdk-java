/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Custom prioritization settings for use by a game session queue when placing new game sessions with available game
 * servers. When defined, this configuration replaces the default FleetIQ prioritization process, which is as follows:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If player latency data is included in a game session request, destinations and locations are prioritized first based
 * on lowest average latency (1), then on lowest hosting cost (2), then on destination list order (3), and finally on
 * location (alphabetical) (4). This approach ensures that the queue's top priority is to place game sessions where
 * average player latency is lowest, and--if latency is the same--where the hosting cost is less, etc.
 * </p>
 * </li>
 * <li>
 * <p>
 * If player latency data is not included, destinations and locations are prioritized first on destination list order
 * (1), and then on location (alphabetical) (2). This approach ensures that the queue's top priority is to place game
 * sessions on the first destination fleet listed. If that fleet has multiple locations, the game session is placed on
 * the first location (when listed alphabetically).
 * </p>
 * </li>
 * </ul>
 * <p>
 * Changing the priority order will affect how game sessions are placed.
 * </p>
 * <p>
 * Priority configurations are part of a <a>GameSessionQueue</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/PriorityConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PriorityConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The recommended sequence to use when prioritizing where to place new game sessions. Each type can only be listed
     * once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LATENCY</code> -- FleetIQ prioritizes locations where the average player latency (provided in each game
     * session request) is lowest.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COST</code> -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is evaluated
     * based on the location, instance type, and fleet type (Spot or On-Demand) for each destination in the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESTINATION</code> -- FleetIQ prioritizes based on the order that destinations are listed in the queue
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCATION</code> -- FleetIQ prioritizes based on the provided order of locations, as defined in
     * <code>LocationOrder</code>.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> priorityOrder;
    /**
     * <p>
     * The prioritization order to use for fleet locations, when the <code>PriorityOrder</code> property includes
     * <code>LOCATION</code>. Locations are identified by AWS Region codes such as <code>us-west-2</code>. Each location
     * can only be listed once.
     * </p>
     */
    private java.util.List<String> locationOrder;

    /**
     * <p>
     * The recommended sequence to use when prioritizing where to place new game sessions. Each type can only be listed
     * once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LATENCY</code> -- FleetIQ prioritizes locations where the average player latency (provided in each game
     * session request) is lowest.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COST</code> -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is evaluated
     * based on the location, instance type, and fleet type (Spot or On-Demand) for each destination in the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESTINATION</code> -- FleetIQ prioritizes based on the order that destinations are listed in the queue
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCATION</code> -- FleetIQ prioritizes based on the provided order of locations, as defined in
     * <code>LocationOrder</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The recommended sequence to use when prioritizing where to place new game sessions. Each type can only be
     *         listed once.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>LATENCY</code> -- FleetIQ prioritizes locations where the average player latency (provided in each
     *         game session request) is lowest.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COST</code> -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is
     *         evaluated based on the location, instance type, and fleet type (Spot or On-Demand) for each destination
     *         in the queue.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DESTINATION</code> -- FleetIQ prioritizes based on the order that destinations are listed in the
     *         queue configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>LOCATION</code> -- FleetIQ prioritizes based on the provided order of locations, as defined in
     *         <code>LocationOrder</code>.
     *         </p>
     *         </li>
     * @see PriorityType
     */

    public java.util.List<String> getPriorityOrder() {
        return priorityOrder;
    }

    /**
     * <p>
     * The recommended sequence to use when prioritizing where to place new game sessions. Each type can only be listed
     * once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LATENCY</code> -- FleetIQ prioritizes locations where the average player latency (provided in each game
     * session request) is lowest.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COST</code> -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is evaluated
     * based on the location, instance type, and fleet type (Spot or On-Demand) for each destination in the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESTINATION</code> -- FleetIQ prioritizes based on the order that destinations are listed in the queue
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCATION</code> -- FleetIQ prioritizes based on the provided order of locations, as defined in
     * <code>LocationOrder</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param priorityOrder
     *        The recommended sequence to use when prioritizing where to place new game sessions. Each type can only be
     *        listed once.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LATENCY</code> -- FleetIQ prioritizes locations where the average player latency (provided in each
     *        game session request) is lowest.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COST</code> -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is
     *        evaluated based on the location, instance type, and fleet type (Spot or On-Demand) for each destination in
     *        the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESTINATION</code> -- FleetIQ prioritizes based on the order that destinations are listed in the
     *        queue configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOCATION</code> -- FleetIQ prioritizes based on the provided order of locations, as defined in
     *        <code>LocationOrder</code>.
     *        </p>
     *        </li>
     * @see PriorityType
     */

    public void setPriorityOrder(java.util.Collection<String> priorityOrder) {
        if (priorityOrder == null) {
            this.priorityOrder = null;
            return;
        }

        this.priorityOrder = new java.util.ArrayList<String>(priorityOrder);
    }

    /**
     * <p>
     * The recommended sequence to use when prioritizing where to place new game sessions. Each type can only be listed
     * once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LATENCY</code> -- FleetIQ prioritizes locations where the average player latency (provided in each game
     * session request) is lowest.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COST</code> -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is evaluated
     * based on the location, instance type, and fleet type (Spot or On-Demand) for each destination in the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESTINATION</code> -- FleetIQ prioritizes based on the order that destinations are listed in the queue
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCATION</code> -- FleetIQ prioritizes based on the provided order of locations, as defined in
     * <code>LocationOrder</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPriorityOrder(java.util.Collection)} or {@link #withPriorityOrder(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param priorityOrder
     *        The recommended sequence to use when prioritizing where to place new game sessions. Each type can only be
     *        listed once.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LATENCY</code> -- FleetIQ prioritizes locations where the average player latency (provided in each
     *        game session request) is lowest.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COST</code> -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is
     *        evaluated based on the location, instance type, and fleet type (Spot or On-Demand) for each destination in
     *        the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESTINATION</code> -- FleetIQ prioritizes based on the order that destinations are listed in the
     *        queue configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOCATION</code> -- FleetIQ prioritizes based on the provided order of locations, as defined in
     *        <code>LocationOrder</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PriorityType
     */

    public PriorityConfiguration withPriorityOrder(String... priorityOrder) {
        if (this.priorityOrder == null) {
            setPriorityOrder(new java.util.ArrayList<String>(priorityOrder.length));
        }
        for (String ele : priorityOrder) {
            this.priorityOrder.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recommended sequence to use when prioritizing where to place new game sessions. Each type can only be listed
     * once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LATENCY</code> -- FleetIQ prioritizes locations where the average player latency (provided in each game
     * session request) is lowest.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COST</code> -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is evaluated
     * based on the location, instance type, and fleet type (Spot or On-Demand) for each destination in the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESTINATION</code> -- FleetIQ prioritizes based on the order that destinations are listed in the queue
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCATION</code> -- FleetIQ prioritizes based on the provided order of locations, as defined in
     * <code>LocationOrder</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param priorityOrder
     *        The recommended sequence to use when prioritizing where to place new game sessions. Each type can only be
     *        listed once.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LATENCY</code> -- FleetIQ prioritizes locations where the average player latency (provided in each
     *        game session request) is lowest.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COST</code> -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is
     *        evaluated based on the location, instance type, and fleet type (Spot or On-Demand) for each destination in
     *        the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESTINATION</code> -- FleetIQ prioritizes based on the order that destinations are listed in the
     *        queue configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOCATION</code> -- FleetIQ prioritizes based on the provided order of locations, as defined in
     *        <code>LocationOrder</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PriorityType
     */

    public PriorityConfiguration withPriorityOrder(java.util.Collection<String> priorityOrder) {
        setPriorityOrder(priorityOrder);
        return this;
    }

    /**
     * <p>
     * The recommended sequence to use when prioritizing where to place new game sessions. Each type can only be listed
     * once.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>LATENCY</code> -- FleetIQ prioritizes locations where the average player latency (provided in each game
     * session request) is lowest.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COST</code> -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is evaluated
     * based on the location, instance type, and fleet type (Spot or On-Demand) for each destination in the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DESTINATION</code> -- FleetIQ prioritizes based on the order that destinations are listed in the queue
     * configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>LOCATION</code> -- FleetIQ prioritizes based on the provided order of locations, as defined in
     * <code>LocationOrder</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param priorityOrder
     *        The recommended sequence to use when prioritizing where to place new game sessions. Each type can only be
     *        listed once.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>LATENCY</code> -- FleetIQ prioritizes locations where the average player latency (provided in each
     *        game session request) is lowest.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COST</code> -- FleetIQ prioritizes destinations with the lowest current hosting costs. Cost is
     *        evaluated based on the location, instance type, and fleet type (Spot or On-Demand) for each destination in
     *        the queue.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DESTINATION</code> -- FleetIQ prioritizes based on the order that destinations are listed in the
     *        queue configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>LOCATION</code> -- FleetIQ prioritizes based on the provided order of locations, as defined in
     *        <code>LocationOrder</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PriorityType
     */

    public PriorityConfiguration withPriorityOrder(PriorityType... priorityOrder) {
        java.util.ArrayList<String> priorityOrderCopy = new java.util.ArrayList<String>(priorityOrder.length);
        for (PriorityType value : priorityOrder) {
            priorityOrderCopy.add(value.toString());
        }
        if (getPriorityOrder() == null) {
            setPriorityOrder(priorityOrderCopy);
        } else {
            getPriorityOrder().addAll(priorityOrderCopy);
        }
        return this;
    }

    /**
     * <p>
     * The prioritization order to use for fleet locations, when the <code>PriorityOrder</code> property includes
     * <code>LOCATION</code>. Locations are identified by AWS Region codes such as <code>us-west-2</code>. Each location
     * can only be listed once.
     * </p>
     * 
     * @return The prioritization order to use for fleet locations, when the <code>PriorityOrder</code> property
     *         includes <code>LOCATION</code>. Locations are identified by AWS Region codes such as
     *         <code>us-west-2</code>. Each location can only be listed once.
     */

    public java.util.List<String> getLocationOrder() {
        return locationOrder;
    }

    /**
     * <p>
     * The prioritization order to use for fleet locations, when the <code>PriorityOrder</code> property includes
     * <code>LOCATION</code>. Locations are identified by AWS Region codes such as <code>us-west-2</code>. Each location
     * can only be listed once.
     * </p>
     * 
     * @param locationOrder
     *        The prioritization order to use for fleet locations, when the <code>PriorityOrder</code> property includes
     *        <code>LOCATION</code>. Locations are identified by AWS Region codes such as <code>us-west-2</code>. Each
     *        location can only be listed once.
     */

    public void setLocationOrder(java.util.Collection<String> locationOrder) {
        if (locationOrder == null) {
            this.locationOrder = null;
            return;
        }

        this.locationOrder = new java.util.ArrayList<String>(locationOrder);
    }

    /**
     * <p>
     * The prioritization order to use for fleet locations, when the <code>PriorityOrder</code> property includes
     * <code>LOCATION</code>. Locations are identified by AWS Region codes such as <code>us-west-2</code>. Each location
     * can only be listed once.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocationOrder(java.util.Collection)} or {@link #withLocationOrder(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param locationOrder
     *        The prioritization order to use for fleet locations, when the <code>PriorityOrder</code> property includes
     *        <code>LOCATION</code>. Locations are identified by AWS Region codes such as <code>us-west-2</code>. Each
     *        location can only be listed once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PriorityConfiguration withLocationOrder(String... locationOrder) {
        if (this.locationOrder == null) {
            setLocationOrder(new java.util.ArrayList<String>(locationOrder.length));
        }
        for (String ele : locationOrder) {
            this.locationOrder.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The prioritization order to use for fleet locations, when the <code>PriorityOrder</code> property includes
     * <code>LOCATION</code>. Locations are identified by AWS Region codes such as <code>us-west-2</code>. Each location
     * can only be listed once.
     * </p>
     * 
     * @param locationOrder
     *        The prioritization order to use for fleet locations, when the <code>PriorityOrder</code> property includes
     *        <code>LOCATION</code>. Locations are identified by AWS Region codes such as <code>us-west-2</code>. Each
     *        location can only be listed once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PriorityConfiguration withLocationOrder(java.util.Collection<String> locationOrder) {
        setLocationOrder(locationOrder);
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
        if (getPriorityOrder() != null)
            sb.append("PriorityOrder: ").append(getPriorityOrder()).append(",");
        if (getLocationOrder() != null)
            sb.append("LocationOrder: ").append(getLocationOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PriorityConfiguration == false)
            return false;
        PriorityConfiguration other = (PriorityConfiguration) obj;
        if (other.getPriorityOrder() == null ^ this.getPriorityOrder() == null)
            return false;
        if (other.getPriorityOrder() != null && other.getPriorityOrder().equals(this.getPriorityOrder()) == false)
            return false;
        if (other.getLocationOrder() == null ^ this.getLocationOrder() == null)
            return false;
        if (other.getLocationOrder() != null && other.getLocationOrder().equals(this.getLocationOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPriorityOrder() == null) ? 0 : getPriorityOrder().hashCode());
        hashCode = prime * hashCode + ((getLocationOrder() == null) ? 0 : getLocationOrder().hashCode());
        return hashCode;
    }

    @Override
    public PriorityConfiguration clone() {
        try {
            return (PriorityConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.PriorityConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
