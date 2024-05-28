/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure to capture query statistics such as how many queries are running, accepted or waiting and their details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/QueryEvalStats" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryEvalStats implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates how long the query waited, in milliseconds.
     * </p>
     */
    private Integer waited;
    /**
     * <p>
     * The number of milliseconds the query has been running so far.
     * </p>
     */
    private Integer elapsed;
    /**
     * <p>
     * Set to <code>TRUE</code> if the query was cancelled, or FALSE otherwise.
     * </p>
     */
    private Boolean cancelled;

    /**
     * <p>
     * Indicates how long the query waited, in milliseconds.
     * </p>
     * 
     * @param waited
     *        Indicates how long the query waited, in milliseconds.
     */

    public void setWaited(Integer waited) {
        this.waited = waited;
    }

    /**
     * <p>
     * Indicates how long the query waited, in milliseconds.
     * </p>
     * 
     * @return Indicates how long the query waited, in milliseconds.
     */

    public Integer getWaited() {
        return this.waited;
    }

    /**
     * <p>
     * Indicates how long the query waited, in milliseconds.
     * </p>
     * 
     * @param waited
     *        Indicates how long the query waited, in milliseconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryEvalStats withWaited(Integer waited) {
        setWaited(waited);
        return this;
    }

    /**
     * <p>
     * The number of milliseconds the query has been running so far.
     * </p>
     * 
     * @param elapsed
     *        The number of milliseconds the query has been running so far.
     */

    public void setElapsed(Integer elapsed) {
        this.elapsed = elapsed;
    }

    /**
     * <p>
     * The number of milliseconds the query has been running so far.
     * </p>
     * 
     * @return The number of milliseconds the query has been running so far.
     */

    public Integer getElapsed() {
        return this.elapsed;
    }

    /**
     * <p>
     * The number of milliseconds the query has been running so far.
     * </p>
     * 
     * @param elapsed
     *        The number of milliseconds the query has been running so far.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryEvalStats withElapsed(Integer elapsed) {
        setElapsed(elapsed);
        return this;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> if the query was cancelled, or FALSE otherwise.
     * </p>
     * 
     * @param cancelled
     *        Set to <code>TRUE</code> if the query was cancelled, or FALSE otherwise.
     */

    public void setCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> if the query was cancelled, or FALSE otherwise.
     * </p>
     * 
     * @return Set to <code>TRUE</code> if the query was cancelled, or FALSE otherwise.
     */

    public Boolean getCancelled() {
        return this.cancelled;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> if the query was cancelled, or FALSE otherwise.
     * </p>
     * 
     * @param cancelled
     *        Set to <code>TRUE</code> if the query was cancelled, or FALSE otherwise.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryEvalStats withCancelled(Boolean cancelled) {
        setCancelled(cancelled);
        return this;
    }

    /**
     * <p>
     * Set to <code>TRUE</code> if the query was cancelled, or FALSE otherwise.
     * </p>
     * 
     * @return Set to <code>TRUE</code> if the query was cancelled, or FALSE otherwise.
     */

    public Boolean isCancelled() {
        return this.cancelled;
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
        if (getWaited() != null)
            sb.append("Waited: ").append(getWaited()).append(",");
        if (getElapsed() != null)
            sb.append("Elapsed: ").append(getElapsed()).append(",");
        if (getCancelled() != null)
            sb.append("Cancelled: ").append(getCancelled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof QueryEvalStats == false)
            return false;
        QueryEvalStats other = (QueryEvalStats) obj;
        if (other.getWaited() == null ^ this.getWaited() == null)
            return false;
        if (other.getWaited() != null && other.getWaited().equals(this.getWaited()) == false)
            return false;
        if (other.getElapsed() == null ^ this.getElapsed() == null)
            return false;
        if (other.getElapsed() != null && other.getElapsed().equals(this.getElapsed()) == false)
            return false;
        if (other.getCancelled() == null ^ this.getCancelled() == null)
            return false;
        if (other.getCancelled() != null && other.getCancelled().equals(this.getCancelled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWaited() == null) ? 0 : getWaited().hashCode());
        hashCode = prime * hashCode + ((getElapsed() == null) ? 0 : getElapsed().hashCode());
        hashCode = prime * hashCode + ((getCancelled() == null) ? 0 : getCancelled().hashCode());
        return hashCode;
    }

    @Override
    public QueryEvalStats clone() {
        try {
            return (QueryEvalStats) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.neptunedata.model.transform.QueryEvalStatsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
