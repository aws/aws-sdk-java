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
package com.amazonaws.services.iotanalytics.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a data store.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotanalytics-2017-11-27/Datastore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Datastore implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the data store.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the data store.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The status of a data store:
     * </p>
     * <dl>
     * <dt>CREATING</dt>
     * <dd>
     * <p>
     * The data store is being created.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The data store has been created and can be used.
     * </p>
     * </dd>
     * <dt>DELETING</dt>
     * <dd>
     * <p>
     * The data store is being deleted.
     * </p>
     * </dd>
     * </dl>
     */
    private String status;
    /**
     * <p>
     * How long, in days, message data is kept for the data store.
     * </p>
     */
    private RetentionPeriod retentionPeriod;
    /**
     * <p>
     * When the data store was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time the data store was updated.
     * </p>
     */
    private java.util.Date lastUpdateTime;

    /**
     * <p>
     * The name of the data store.
     * </p>
     * 
     * @param name
     *        The name of the data store.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the data store.
     * </p>
     * 
     * @return The name of the data store.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the data store.
     * </p>
     * 
     * @param name
     *        The name of the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datastore withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the data store.
     * </p>
     * 
     * @param arn
     *        The ARN of the data store.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the data store.
     * </p>
     * 
     * @return The ARN of the data store.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the data store.
     * </p>
     * 
     * @param arn
     *        The ARN of the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datastore withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The status of a data store:
     * </p>
     * <dl>
     * <dt>CREATING</dt>
     * <dd>
     * <p>
     * The data store is being created.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The data store has been created and can be used.
     * </p>
     * </dd>
     * <dt>DELETING</dt>
     * <dd>
     * <p>
     * The data store is being deleted.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of a data store:</p>
     *        <dl>
     *        <dt>CREATING</dt>
     *        <dd>
     *        <p>
     *        The data store is being created.
     *        </p>
     *        </dd>
     *        <dt>ACTIVE</dt>
     *        <dd>
     *        <p>
     *        The data store has been created and can be used.
     *        </p>
     *        </dd>
     *        <dt>DELETING</dt>
     *        <dd>
     *        <p>
     *        The data store is being deleted.
     *        </p>
     *        </dd>
     * @see DatastoreStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a data store:
     * </p>
     * <dl>
     * <dt>CREATING</dt>
     * <dd>
     * <p>
     * The data store is being created.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The data store has been created and can be used.
     * </p>
     * </dd>
     * <dt>DELETING</dt>
     * <dd>
     * <p>
     * The data store is being deleted.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The status of a data store:</p>
     *         <dl>
     *         <dt>CREATING</dt>
     *         <dd>
     *         <p>
     *         The data store is being created.
     *         </p>
     *         </dd>
     *         <dt>ACTIVE</dt>
     *         <dd>
     *         <p>
     *         The data store has been created and can be used.
     *         </p>
     *         </dd>
     *         <dt>DELETING</dt>
     *         <dd>
     *         <p>
     *         The data store is being deleted.
     *         </p>
     *         </dd>
     * @see DatastoreStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a data store:
     * </p>
     * <dl>
     * <dt>CREATING</dt>
     * <dd>
     * <p>
     * The data store is being created.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The data store has been created and can be used.
     * </p>
     * </dd>
     * <dt>DELETING</dt>
     * <dd>
     * <p>
     * The data store is being deleted.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of a data store:</p>
     *        <dl>
     *        <dt>CREATING</dt>
     *        <dd>
     *        <p>
     *        The data store is being created.
     *        </p>
     *        </dd>
     *        <dt>ACTIVE</dt>
     *        <dd>
     *        <p>
     *        The data store has been created and can be used.
     *        </p>
     *        </dd>
     *        <dt>DELETING</dt>
     *        <dd>
     *        <p>
     *        The data store is being deleted.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatastoreStatus
     */

    public Datastore withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a data store:
     * </p>
     * <dl>
     * <dt>CREATING</dt>
     * <dd>
     * <p>
     * The data store is being created.
     * </p>
     * </dd>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The data store has been created and can be used.
     * </p>
     * </dd>
     * <dt>DELETING</dt>
     * <dd>
     * <p>
     * The data store is being deleted.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of a data store:</p>
     *        <dl>
     *        <dt>CREATING</dt>
     *        <dd>
     *        <p>
     *        The data store is being created.
     *        </p>
     *        </dd>
     *        <dt>ACTIVE</dt>
     *        <dd>
     *        <p>
     *        The data store has been created and can be used.
     *        </p>
     *        </dd>
     *        <dt>DELETING</dt>
     *        <dd>
     *        <p>
     *        The data store is being deleted.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DatastoreStatus
     */

    public Datastore withStatus(DatastoreStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * How long, in days, message data is kept for the data store.
     * </p>
     * 
     * @param retentionPeriod
     *        How long, in days, message data is kept for the data store.
     */

    public void setRetentionPeriod(RetentionPeriod retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }

    /**
     * <p>
     * How long, in days, message data is kept for the data store.
     * </p>
     * 
     * @return How long, in days, message data is kept for the data store.
     */

    public RetentionPeriod getRetentionPeriod() {
        return this.retentionPeriod;
    }

    /**
     * <p>
     * How long, in days, message data is kept for the data store.
     * </p>
     * 
     * @param retentionPeriod
     *        How long, in days, message data is kept for the data store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datastore withRetentionPeriod(RetentionPeriod retentionPeriod) {
        setRetentionPeriod(retentionPeriod);
        return this;
    }

    /**
     * <p>
     * When the data store was created.
     * </p>
     * 
     * @param creationTime
     *        When the data store was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the data store was created.
     * </p>
     * 
     * @return When the data store was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the data store was created.
     * </p>
     * 
     * @param creationTime
     *        When the data store was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datastore withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time the data store was updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last time the data store was updated.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The last time the data store was updated.
     * </p>
     * 
     * @return The last time the data store was updated.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The last time the data store was updated.
     * </p>
     * 
     * @param lastUpdateTime
     *        The last time the data store was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Datastore withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRetentionPeriod() != null)
            sb.append("RetentionPeriod: ").append(getRetentionPeriod()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Datastore == false)
            return false;
        Datastore other = (Datastore) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRetentionPeriod() == null ^ this.getRetentionPeriod() == null)
            return false;
        if (other.getRetentionPeriod() != null && other.getRetentionPeriod().equals(this.getRetentionPeriod()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriod() == null) ? 0 : getRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public Datastore clone() {
        try {
            return (Datastore) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotanalytics.model.transform.DatastoreMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
