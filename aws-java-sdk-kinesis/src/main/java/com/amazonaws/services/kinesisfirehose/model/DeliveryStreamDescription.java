/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a delivery stream.
 * </p>
 */
public class DeliveryStreamDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     */
    private String deliveryStreamName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delivery stream.
     * </p>
     */
    private String deliveryStreamARN;
    /**
     * <p>
     * The status of the delivery stream.
     * </p>
     */
    private String deliveryStreamStatus;
    /**
     * <p>
     * Used when calling the <a>UpdateDestination</a> operation. Each time the destination is updated for the delivery
     * stream, the VersionId is changed, and the current VersionId is required when updating the destination. This is so
     * that the service knows it is applying the changes to the correct version of the delivery stream.
     * </p>
     */
    private String versionId;
    /**
     * <p>
     * The date and time that the delivery stream was created.
     * </p>
     */
    private java.util.Date createTimestamp;
    /**
     * <p>
     * The date and time that the delivery stream was last updated.
     * </p>
     */
    private java.util.Date lastUpdateTimestamp;
    /**
     * <p>
     * The destinations.
     * </p>
     */
    private java.util.List<DestinationDescription> destinations;
    /**
     * <p>
     * Indicates whether there are more destinations available to list.
     * </p>
     */
    private Boolean hasMoreDestinations;

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamName
     *        The name of the delivery stream.
     */

    public void setDeliveryStreamName(String deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
    }

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * 
     * @return The name of the delivery stream.
     */

    public String getDeliveryStreamName() {
        return this.deliveryStreamName;
    }

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamName
     *        The name of the delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamDescription withDeliveryStreamName(String deliveryStreamName) {
        setDeliveryStreamName(deliveryStreamName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamARN
     *        The Amazon Resource Name (ARN) of the delivery stream.
     */

    public void setDeliveryStreamARN(String deliveryStreamARN) {
        this.deliveryStreamARN = deliveryStreamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delivery stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the delivery stream.
     */

    public String getDeliveryStreamARN() {
        return this.deliveryStreamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamARN
     *        The Amazon Resource Name (ARN) of the delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamDescription withDeliveryStreamARN(String deliveryStreamARN) {
        setDeliveryStreamARN(deliveryStreamARN);
        return this;
    }

    /**
     * <p>
     * The status of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamStatus
     *        The status of the delivery stream.
     * @see DeliveryStreamStatus
     */

    public void setDeliveryStreamStatus(String deliveryStreamStatus) {
        this.deliveryStreamStatus = deliveryStreamStatus;
    }

    /**
     * <p>
     * The status of the delivery stream.
     * </p>
     * 
     * @return The status of the delivery stream.
     * @see DeliveryStreamStatus
     */

    public String getDeliveryStreamStatus() {
        return this.deliveryStreamStatus;
    }

    /**
     * <p>
     * The status of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamStatus
     *        The status of the delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStreamStatus
     */

    public DeliveryStreamDescription withDeliveryStreamStatus(String deliveryStreamStatus) {
        setDeliveryStreamStatus(deliveryStreamStatus);
        return this;
    }

    /**
     * <p>
     * The status of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamStatus
     *        The status of the delivery stream.
     * @see DeliveryStreamStatus
     */

    public void setDeliveryStreamStatus(DeliveryStreamStatus deliveryStreamStatus) {
        this.deliveryStreamStatus = deliveryStreamStatus.toString();
    }

    /**
     * <p>
     * The status of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamStatus
     *        The status of the delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryStreamStatus
     */

    public DeliveryStreamDescription withDeliveryStreamStatus(DeliveryStreamStatus deliveryStreamStatus) {
        setDeliveryStreamStatus(deliveryStreamStatus);
        return this;
    }

    /**
     * <p>
     * Used when calling the <a>UpdateDestination</a> operation. Each time the destination is updated for the delivery
     * stream, the VersionId is changed, and the current VersionId is required when updating the destination. This is so
     * that the service knows it is applying the changes to the correct version of the delivery stream.
     * </p>
     * 
     * @param versionId
     *        Used when calling the <a>UpdateDestination</a> operation. Each time the destination is updated for the
     *        delivery stream, the VersionId is changed, and the current VersionId is required when updating the
     *        destination. This is so that the service knows it is applying the changes to the correct version of the
     *        delivery stream.
     */

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    /**
     * <p>
     * Used when calling the <a>UpdateDestination</a> operation. Each time the destination is updated for the delivery
     * stream, the VersionId is changed, and the current VersionId is required when updating the destination. This is so
     * that the service knows it is applying the changes to the correct version of the delivery stream.
     * </p>
     * 
     * @return Used when calling the <a>UpdateDestination</a> operation. Each time the destination is updated for the
     *         delivery stream, the VersionId is changed, and the current VersionId is required when updating the
     *         destination. This is so that the service knows it is applying the changes to the correct version of the
     *         delivery stream.
     */

    public String getVersionId() {
        return this.versionId;
    }

    /**
     * <p>
     * Used when calling the <a>UpdateDestination</a> operation. Each time the destination is updated for the delivery
     * stream, the VersionId is changed, and the current VersionId is required when updating the destination. This is so
     * that the service knows it is applying the changes to the correct version of the delivery stream.
     * </p>
     * 
     * @param versionId
     *        Used when calling the <a>UpdateDestination</a> operation. Each time the destination is updated for the
     *        delivery stream, the VersionId is changed, and the current VersionId is required when updating the
     *        destination. This is so that the service knows it is applying the changes to the correct version of the
     *        delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamDescription withVersionId(String versionId) {
        setVersionId(versionId);
        return this;
    }

    /**
     * <p>
     * The date and time that the delivery stream was created.
     * </p>
     * 
     * @param createTimestamp
     *        The date and time that the delivery stream was created.
     */

    public void setCreateTimestamp(java.util.Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    /**
     * <p>
     * The date and time that the delivery stream was created.
     * </p>
     * 
     * @return The date and time that the delivery stream was created.
     */

    public java.util.Date getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * <p>
     * The date and time that the delivery stream was created.
     * </p>
     * 
     * @param createTimestamp
     *        The date and time that the delivery stream was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamDescription withCreateTimestamp(java.util.Date createTimestamp) {
        setCreateTimestamp(createTimestamp);
        return this;
    }

    /**
     * <p>
     * The date and time that the delivery stream was last updated.
     * </p>
     * 
     * @param lastUpdateTimestamp
     *        The date and time that the delivery stream was last updated.
     */

    public void setLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        this.lastUpdateTimestamp = lastUpdateTimestamp;
    }

    /**
     * <p>
     * The date and time that the delivery stream was last updated.
     * </p>
     * 
     * @return The date and time that the delivery stream was last updated.
     */

    public java.util.Date getLastUpdateTimestamp() {
        return this.lastUpdateTimestamp;
    }

    /**
     * <p>
     * The date and time that the delivery stream was last updated.
     * </p>
     * 
     * @param lastUpdateTimestamp
     *        The date and time that the delivery stream was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamDescription withLastUpdateTimestamp(java.util.Date lastUpdateTimestamp) {
        setLastUpdateTimestamp(lastUpdateTimestamp);
        return this;
    }

    /**
     * <p>
     * The destinations.
     * </p>
     * 
     * @return The destinations.
     */

    public java.util.List<DestinationDescription> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * The destinations.
     * </p>
     * 
     * @param destinations
     *        The destinations.
     */

    public void setDestinations(java.util.Collection<DestinationDescription> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<DestinationDescription>(destinations);
    }

    /**
     * <p>
     * The destinations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        The destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamDescription withDestinations(DestinationDescription... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<DestinationDescription>(destinations.length));
        }
        for (DestinationDescription ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The destinations.
     * </p>
     * 
     * @param destinations
     *        The destinations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamDescription withDestinations(java.util.Collection<DestinationDescription> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are more destinations available to list.
     * </p>
     * 
     * @param hasMoreDestinations
     *        Indicates whether there are more destinations available to list.
     */

    public void setHasMoreDestinations(Boolean hasMoreDestinations) {
        this.hasMoreDestinations = hasMoreDestinations;
    }

    /**
     * <p>
     * Indicates whether there are more destinations available to list.
     * </p>
     * 
     * @return Indicates whether there are more destinations available to list.
     */

    public Boolean getHasMoreDestinations() {
        return this.hasMoreDestinations;
    }

    /**
     * <p>
     * Indicates whether there are more destinations available to list.
     * </p>
     * 
     * @param hasMoreDestinations
     *        Indicates whether there are more destinations available to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeliveryStreamDescription withHasMoreDestinations(Boolean hasMoreDestinations) {
        setHasMoreDestinations(hasMoreDestinations);
        return this;
    }

    /**
     * <p>
     * Indicates whether there are more destinations available to list.
     * </p>
     * 
     * @return Indicates whether there are more destinations available to list.
     */

    public Boolean isHasMoreDestinations() {
        return this.hasMoreDestinations;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDeliveryStreamName() != null)
            sb.append("DeliveryStreamName: " + getDeliveryStreamName() + ",");
        if (getDeliveryStreamARN() != null)
            sb.append("DeliveryStreamARN: " + getDeliveryStreamARN() + ",");
        if (getDeliveryStreamStatus() != null)
            sb.append("DeliveryStreamStatus: " + getDeliveryStreamStatus() + ",");
        if (getVersionId() != null)
            sb.append("VersionId: " + getVersionId() + ",");
        if (getCreateTimestamp() != null)
            sb.append("CreateTimestamp: " + getCreateTimestamp() + ",");
        if (getLastUpdateTimestamp() != null)
            sb.append("LastUpdateTimestamp: " + getLastUpdateTimestamp() + ",");
        if (getDestinations() != null)
            sb.append("Destinations: " + getDestinations() + ",");
        if (getHasMoreDestinations() != null)
            sb.append("HasMoreDestinations: " + getHasMoreDestinations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeliveryStreamDescription == false)
            return false;
        DeliveryStreamDescription other = (DeliveryStreamDescription) obj;
        if (other.getDeliveryStreamName() == null ^ this.getDeliveryStreamName() == null)
            return false;
        if (other.getDeliveryStreamName() != null && other.getDeliveryStreamName().equals(this.getDeliveryStreamName()) == false)
            return false;
        if (other.getDeliveryStreamARN() == null ^ this.getDeliveryStreamARN() == null)
            return false;
        if (other.getDeliveryStreamARN() != null && other.getDeliveryStreamARN().equals(this.getDeliveryStreamARN()) == false)
            return false;
        if (other.getDeliveryStreamStatus() == null ^ this.getDeliveryStreamStatus() == null)
            return false;
        if (other.getDeliveryStreamStatus() != null && other.getDeliveryStreamStatus().equals(this.getDeliveryStreamStatus()) == false)
            return false;
        if (other.getVersionId() == null ^ this.getVersionId() == null)
            return false;
        if (other.getVersionId() != null && other.getVersionId().equals(this.getVersionId()) == false)
            return false;
        if (other.getCreateTimestamp() == null ^ this.getCreateTimestamp() == null)
            return false;
        if (other.getCreateTimestamp() != null && other.getCreateTimestamp().equals(this.getCreateTimestamp()) == false)
            return false;
        if (other.getLastUpdateTimestamp() == null ^ this.getLastUpdateTimestamp() == null)
            return false;
        if (other.getLastUpdateTimestamp() != null && other.getLastUpdateTimestamp().equals(this.getLastUpdateTimestamp()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getHasMoreDestinations() == null ^ this.getHasMoreDestinations() == null)
            return false;
        if (other.getHasMoreDestinations() != null && other.getHasMoreDestinations().equals(this.getHasMoreDestinations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeliveryStreamName() == null) ? 0 : getDeliveryStreamName().hashCode());
        hashCode = prime * hashCode + ((getDeliveryStreamARN() == null) ? 0 : getDeliveryStreamARN().hashCode());
        hashCode = prime * hashCode + ((getDeliveryStreamStatus() == null) ? 0 : getDeliveryStreamStatus().hashCode());
        hashCode = prime * hashCode + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
        hashCode = prime * hashCode + ((getCreateTimestamp() == null) ? 0 : getCreateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTimestamp() == null) ? 0 : getLastUpdateTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getHasMoreDestinations() == null) ? 0 : getHasMoreDestinations().hashCode());
        return hashCode;
    }

    @Override
    public DeliveryStreamDescription clone() {
        try {
            return (DeliveryStreamDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
