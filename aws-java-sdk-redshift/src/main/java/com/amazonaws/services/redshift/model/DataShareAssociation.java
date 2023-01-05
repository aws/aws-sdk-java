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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The association of a datashare from a producer account with a data consumer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DataShareAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DataShareAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the consumer accounts that have an association with a producer datashare.
     * </p>
     */
    private String consumerIdentifier;
    /**
     * <p>
     * The status of the datashare that is associated.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Amazon Web Services Region of the consumer accounts that have an association with a producer datashare.
     * </p>
     */
    private String consumerRegion;
    /**
     * <p>
     * The creation date of the datashare that is associated.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The status change data of the datashare that is associated.
     * </p>
     */
    private java.util.Date statusChangeDate;

    /**
     * <p>
     * The name of the consumer accounts that have an association with a producer datashare.
     * </p>
     * 
     * @param consumerIdentifier
     *        The name of the consumer accounts that have an association with a producer datashare.
     */

    public void setConsumerIdentifier(String consumerIdentifier) {
        this.consumerIdentifier = consumerIdentifier;
    }

    /**
     * <p>
     * The name of the consumer accounts that have an association with a producer datashare.
     * </p>
     * 
     * @return The name of the consumer accounts that have an association with a producer datashare.
     */

    public String getConsumerIdentifier() {
        return this.consumerIdentifier;
    }

    /**
     * <p>
     * The name of the consumer accounts that have an association with a producer datashare.
     * </p>
     * 
     * @param consumerIdentifier
     *        The name of the consumer accounts that have an association with a producer datashare.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataShareAssociation withConsumerIdentifier(String consumerIdentifier) {
        setConsumerIdentifier(consumerIdentifier);
        return this;
    }

    /**
     * <p>
     * The status of the datashare that is associated.
     * </p>
     * 
     * @param status
     *        The status of the datashare that is associated.
     * @see DataShareStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the datashare that is associated.
     * </p>
     * 
     * @return The status of the datashare that is associated.
     * @see DataShareStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the datashare that is associated.
     * </p>
     * 
     * @param status
     *        The status of the datashare that is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataShareStatus
     */

    public DataShareAssociation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the datashare that is associated.
     * </p>
     * 
     * @param status
     *        The status of the datashare that is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataShareStatus
     */

    public DataShareAssociation withStatus(DataShareStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the consumer accounts that have an association with a producer datashare.
     * </p>
     * 
     * @param consumerRegion
     *        The Amazon Web Services Region of the consumer accounts that have an association with a producer
     *        datashare.
     */

    public void setConsumerRegion(String consumerRegion) {
        this.consumerRegion = consumerRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the consumer accounts that have an association with a producer datashare.
     * </p>
     * 
     * @return The Amazon Web Services Region of the consumer accounts that have an association with a producer
     *         datashare.
     */

    public String getConsumerRegion() {
        return this.consumerRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the consumer accounts that have an association with a producer datashare.
     * </p>
     * 
     * @param consumerRegion
     *        The Amazon Web Services Region of the consumer accounts that have an association with a producer
     *        datashare.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataShareAssociation withConsumerRegion(String consumerRegion) {
        setConsumerRegion(consumerRegion);
        return this;
    }

    /**
     * <p>
     * The creation date of the datashare that is associated.
     * </p>
     * 
     * @param createdDate
     *        The creation date of the datashare that is associated.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The creation date of the datashare that is associated.
     * </p>
     * 
     * @return The creation date of the datashare that is associated.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The creation date of the datashare that is associated.
     * </p>
     * 
     * @param createdDate
     *        The creation date of the datashare that is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataShareAssociation withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The status change data of the datashare that is associated.
     * </p>
     * 
     * @param statusChangeDate
     *        The status change data of the datashare that is associated.
     */

    public void setStatusChangeDate(java.util.Date statusChangeDate) {
        this.statusChangeDate = statusChangeDate;
    }

    /**
     * <p>
     * The status change data of the datashare that is associated.
     * </p>
     * 
     * @return The status change data of the datashare that is associated.
     */

    public java.util.Date getStatusChangeDate() {
        return this.statusChangeDate;
    }

    /**
     * <p>
     * The status change data of the datashare that is associated.
     * </p>
     * 
     * @param statusChangeDate
     *        The status change data of the datashare that is associated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DataShareAssociation withStatusChangeDate(java.util.Date statusChangeDate) {
        setStatusChangeDate(statusChangeDate);
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
        if (getConsumerIdentifier() != null)
            sb.append("ConsumerIdentifier: ").append(getConsumerIdentifier()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getConsumerRegion() != null)
            sb.append("ConsumerRegion: ").append(getConsumerRegion()).append(",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: ").append(getCreatedDate()).append(",");
        if (getStatusChangeDate() != null)
            sb.append("StatusChangeDate: ").append(getStatusChangeDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DataShareAssociation == false)
            return false;
        DataShareAssociation other = (DataShareAssociation) obj;
        if (other.getConsumerIdentifier() == null ^ this.getConsumerIdentifier() == null)
            return false;
        if (other.getConsumerIdentifier() != null && other.getConsumerIdentifier().equals(this.getConsumerIdentifier()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getConsumerRegion() == null ^ this.getConsumerRegion() == null)
            return false;
        if (other.getConsumerRegion() != null && other.getConsumerRegion().equals(this.getConsumerRegion()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getStatusChangeDate() == null ^ this.getStatusChangeDate() == null)
            return false;
        if (other.getStatusChangeDate() != null && other.getStatusChangeDate().equals(this.getStatusChangeDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConsumerIdentifier() == null) ? 0 : getConsumerIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getConsumerRegion() == null) ? 0 : getConsumerRegion().hashCode());
        hashCode = prime * hashCode + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime * hashCode + ((getStatusChangeDate() == null) ? 0 : getStatusChangeDate().hashCode());
        return hashCode;
    }

    @Override
    public DataShareAssociation clone() {
        try {
            return (DataShareAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
