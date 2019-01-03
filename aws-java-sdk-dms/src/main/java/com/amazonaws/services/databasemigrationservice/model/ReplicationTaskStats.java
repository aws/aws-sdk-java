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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ReplicationTaskStats" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationTaskStats implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The percent complete for the full load migration task.
     * </p>
     */
    private Integer fullLoadProgressPercent;
    /**
     * <p>
     * The elapsed time of the task, in milliseconds.
     * </p>
     */
    private Long elapsedTimeMillis;
    /**
     * <p>
     * The number of tables loaded for this task.
     * </p>
     */
    private Integer tablesLoaded;
    /**
     * <p>
     * The number of tables currently loading for this task.
     * </p>
     */
    private Integer tablesLoading;
    /**
     * <p>
     * The number of tables queued for this task.
     * </p>
     */
    private Integer tablesQueued;
    /**
     * <p>
     * The number of errors that have occurred during this task.
     * </p>
     */
    private Integer tablesErrored;

    /**
     * <p>
     * The percent complete for the full load migration task.
     * </p>
     * 
     * @param fullLoadProgressPercent
     *        The percent complete for the full load migration task.
     */

    public void setFullLoadProgressPercent(Integer fullLoadProgressPercent) {
        this.fullLoadProgressPercent = fullLoadProgressPercent;
    }

    /**
     * <p>
     * The percent complete for the full load migration task.
     * </p>
     * 
     * @return The percent complete for the full load migration task.
     */

    public Integer getFullLoadProgressPercent() {
        return this.fullLoadProgressPercent;
    }

    /**
     * <p>
     * The percent complete for the full load migration task.
     * </p>
     * 
     * @param fullLoadProgressPercent
     *        The percent complete for the full load migration task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskStats withFullLoadProgressPercent(Integer fullLoadProgressPercent) {
        setFullLoadProgressPercent(fullLoadProgressPercent);
        return this;
    }

    /**
     * <p>
     * The elapsed time of the task, in milliseconds.
     * </p>
     * 
     * @param elapsedTimeMillis
     *        The elapsed time of the task, in milliseconds.
     */

    public void setElapsedTimeMillis(Long elapsedTimeMillis) {
        this.elapsedTimeMillis = elapsedTimeMillis;
    }

    /**
     * <p>
     * The elapsed time of the task, in milliseconds.
     * </p>
     * 
     * @return The elapsed time of the task, in milliseconds.
     */

    public Long getElapsedTimeMillis() {
        return this.elapsedTimeMillis;
    }

    /**
     * <p>
     * The elapsed time of the task, in milliseconds.
     * </p>
     * 
     * @param elapsedTimeMillis
     *        The elapsed time of the task, in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskStats withElapsedTimeMillis(Long elapsedTimeMillis) {
        setElapsedTimeMillis(elapsedTimeMillis);
        return this;
    }

    /**
     * <p>
     * The number of tables loaded for this task.
     * </p>
     * 
     * @param tablesLoaded
     *        The number of tables loaded for this task.
     */

    public void setTablesLoaded(Integer tablesLoaded) {
        this.tablesLoaded = tablesLoaded;
    }

    /**
     * <p>
     * The number of tables loaded for this task.
     * </p>
     * 
     * @return The number of tables loaded for this task.
     */

    public Integer getTablesLoaded() {
        return this.tablesLoaded;
    }

    /**
     * <p>
     * The number of tables loaded for this task.
     * </p>
     * 
     * @param tablesLoaded
     *        The number of tables loaded for this task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskStats withTablesLoaded(Integer tablesLoaded) {
        setTablesLoaded(tablesLoaded);
        return this;
    }

    /**
     * <p>
     * The number of tables currently loading for this task.
     * </p>
     * 
     * @param tablesLoading
     *        The number of tables currently loading for this task.
     */

    public void setTablesLoading(Integer tablesLoading) {
        this.tablesLoading = tablesLoading;
    }

    /**
     * <p>
     * The number of tables currently loading for this task.
     * </p>
     * 
     * @return The number of tables currently loading for this task.
     */

    public Integer getTablesLoading() {
        return this.tablesLoading;
    }

    /**
     * <p>
     * The number of tables currently loading for this task.
     * </p>
     * 
     * @param tablesLoading
     *        The number of tables currently loading for this task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskStats withTablesLoading(Integer tablesLoading) {
        setTablesLoading(tablesLoading);
        return this;
    }

    /**
     * <p>
     * The number of tables queued for this task.
     * </p>
     * 
     * @param tablesQueued
     *        The number of tables queued for this task.
     */

    public void setTablesQueued(Integer tablesQueued) {
        this.tablesQueued = tablesQueued;
    }

    /**
     * <p>
     * The number of tables queued for this task.
     * </p>
     * 
     * @return The number of tables queued for this task.
     */

    public Integer getTablesQueued() {
        return this.tablesQueued;
    }

    /**
     * <p>
     * The number of tables queued for this task.
     * </p>
     * 
     * @param tablesQueued
     *        The number of tables queued for this task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskStats withTablesQueued(Integer tablesQueued) {
        setTablesQueued(tablesQueued);
        return this;
    }

    /**
     * <p>
     * The number of errors that have occurred during this task.
     * </p>
     * 
     * @param tablesErrored
     *        The number of errors that have occurred during this task.
     */

    public void setTablesErrored(Integer tablesErrored) {
        this.tablesErrored = tablesErrored;
    }

    /**
     * <p>
     * The number of errors that have occurred during this task.
     * </p>
     * 
     * @return The number of errors that have occurred during this task.
     */

    public Integer getTablesErrored() {
        return this.tablesErrored;
    }

    /**
     * <p>
     * The number of errors that have occurred during this task.
     * </p>
     * 
     * @param tablesErrored
     *        The number of errors that have occurred during this task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskStats withTablesErrored(Integer tablesErrored) {
        setTablesErrored(tablesErrored);
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
        if (getFullLoadProgressPercent() != null)
            sb.append("FullLoadProgressPercent: ").append(getFullLoadProgressPercent()).append(",");
        if (getElapsedTimeMillis() != null)
            sb.append("ElapsedTimeMillis: ").append(getElapsedTimeMillis()).append(",");
        if (getTablesLoaded() != null)
            sb.append("TablesLoaded: ").append(getTablesLoaded()).append(",");
        if (getTablesLoading() != null)
            sb.append("TablesLoading: ").append(getTablesLoading()).append(",");
        if (getTablesQueued() != null)
            sb.append("TablesQueued: ").append(getTablesQueued()).append(",");
        if (getTablesErrored() != null)
            sb.append("TablesErrored: ").append(getTablesErrored());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationTaskStats == false)
            return false;
        ReplicationTaskStats other = (ReplicationTaskStats) obj;
        if (other.getFullLoadProgressPercent() == null ^ this.getFullLoadProgressPercent() == null)
            return false;
        if (other.getFullLoadProgressPercent() != null && other.getFullLoadProgressPercent().equals(this.getFullLoadProgressPercent()) == false)
            return false;
        if (other.getElapsedTimeMillis() == null ^ this.getElapsedTimeMillis() == null)
            return false;
        if (other.getElapsedTimeMillis() != null && other.getElapsedTimeMillis().equals(this.getElapsedTimeMillis()) == false)
            return false;
        if (other.getTablesLoaded() == null ^ this.getTablesLoaded() == null)
            return false;
        if (other.getTablesLoaded() != null && other.getTablesLoaded().equals(this.getTablesLoaded()) == false)
            return false;
        if (other.getTablesLoading() == null ^ this.getTablesLoading() == null)
            return false;
        if (other.getTablesLoading() != null && other.getTablesLoading().equals(this.getTablesLoading()) == false)
            return false;
        if (other.getTablesQueued() == null ^ this.getTablesQueued() == null)
            return false;
        if (other.getTablesQueued() != null && other.getTablesQueued().equals(this.getTablesQueued()) == false)
            return false;
        if (other.getTablesErrored() == null ^ this.getTablesErrored() == null)
            return false;
        if (other.getTablesErrored() != null && other.getTablesErrored().equals(this.getTablesErrored()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFullLoadProgressPercent() == null) ? 0 : getFullLoadProgressPercent().hashCode());
        hashCode = prime * hashCode + ((getElapsedTimeMillis() == null) ? 0 : getElapsedTimeMillis().hashCode());
        hashCode = prime * hashCode + ((getTablesLoaded() == null) ? 0 : getTablesLoaded().hashCode());
        hashCode = prime * hashCode + ((getTablesLoading() == null) ? 0 : getTablesLoading().hashCode());
        hashCode = prime * hashCode + ((getTablesQueued() == null) ? 0 : getTablesQueued().hashCode());
        hashCode = prime * hashCode + ((getTablesErrored() == null) ? 0 : getTablesErrored().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationTaskStats clone() {
        try {
            return (ReplicationTaskStats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.ReplicationTaskStatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
