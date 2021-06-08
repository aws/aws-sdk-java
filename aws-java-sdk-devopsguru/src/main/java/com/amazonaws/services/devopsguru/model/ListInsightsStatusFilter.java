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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A filter used by <code>ListInsights</code> to specify which insights to return.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListInsightsStatusFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInsightsStatusFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A <code>ListInsightsAnyStatusFilter</code> that specifies ongoing insights that are either <code>REACTIVE</code>
     * or <code>PROACTIVE</code>.
     * </p>
     */
    private ListInsightsOngoingStatusFilter ongoing;
    /**
     * <p>
     * A <code>ListInsightsClosedStatusFilter</code> that specifies closed insights that are either
     * <code>REACTIVE</code> or <code>PROACTIVE</code>.
     * </p>
     */
    private ListInsightsClosedStatusFilter closed;
    /**
     * <p>
     * A <code>ListInsightsAnyStatusFilter</code> that specifies insights of any status that are either
     * <code>REACTIVE</code> or <code>PROACTIVE</code>.
     * </p>
     */
    private ListInsightsAnyStatusFilter any;

    /**
     * <p>
     * A <code>ListInsightsAnyStatusFilter</code> that specifies ongoing insights that are either <code>REACTIVE</code>
     * or <code>PROACTIVE</code>.
     * </p>
     * 
     * @param ongoing
     *        A <code>ListInsightsAnyStatusFilter</code> that specifies ongoing insights that are either
     *        <code>REACTIVE</code> or <code>PROACTIVE</code>.
     */

    public void setOngoing(ListInsightsOngoingStatusFilter ongoing) {
        this.ongoing = ongoing;
    }

    /**
     * <p>
     * A <code>ListInsightsAnyStatusFilter</code> that specifies ongoing insights that are either <code>REACTIVE</code>
     * or <code>PROACTIVE</code>.
     * </p>
     * 
     * @return A <code>ListInsightsAnyStatusFilter</code> that specifies ongoing insights that are either
     *         <code>REACTIVE</code> or <code>PROACTIVE</code>.
     */

    public ListInsightsOngoingStatusFilter getOngoing() {
        return this.ongoing;
    }

    /**
     * <p>
     * A <code>ListInsightsAnyStatusFilter</code> that specifies ongoing insights that are either <code>REACTIVE</code>
     * or <code>PROACTIVE</code>.
     * </p>
     * 
     * @param ongoing
     *        A <code>ListInsightsAnyStatusFilter</code> that specifies ongoing insights that are either
     *        <code>REACTIVE</code> or <code>PROACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsStatusFilter withOngoing(ListInsightsOngoingStatusFilter ongoing) {
        setOngoing(ongoing);
        return this;
    }

    /**
     * <p>
     * A <code>ListInsightsClosedStatusFilter</code> that specifies closed insights that are either
     * <code>REACTIVE</code> or <code>PROACTIVE</code>.
     * </p>
     * 
     * @param closed
     *        A <code>ListInsightsClosedStatusFilter</code> that specifies closed insights that are either
     *        <code>REACTIVE</code> or <code>PROACTIVE</code>.
     */

    public void setClosed(ListInsightsClosedStatusFilter closed) {
        this.closed = closed;
    }

    /**
     * <p>
     * A <code>ListInsightsClosedStatusFilter</code> that specifies closed insights that are either
     * <code>REACTIVE</code> or <code>PROACTIVE</code>.
     * </p>
     * 
     * @return A <code>ListInsightsClosedStatusFilter</code> that specifies closed insights that are either
     *         <code>REACTIVE</code> or <code>PROACTIVE</code>.
     */

    public ListInsightsClosedStatusFilter getClosed() {
        return this.closed;
    }

    /**
     * <p>
     * A <code>ListInsightsClosedStatusFilter</code> that specifies closed insights that are either
     * <code>REACTIVE</code> or <code>PROACTIVE</code>.
     * </p>
     * 
     * @param closed
     *        A <code>ListInsightsClosedStatusFilter</code> that specifies closed insights that are either
     *        <code>REACTIVE</code> or <code>PROACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsStatusFilter withClosed(ListInsightsClosedStatusFilter closed) {
        setClosed(closed);
        return this;
    }

    /**
     * <p>
     * A <code>ListInsightsAnyStatusFilter</code> that specifies insights of any status that are either
     * <code>REACTIVE</code> or <code>PROACTIVE</code>.
     * </p>
     * 
     * @param any
     *        A <code>ListInsightsAnyStatusFilter</code> that specifies insights of any status that are either
     *        <code>REACTIVE</code> or <code>PROACTIVE</code>.
     */

    public void setAny(ListInsightsAnyStatusFilter any) {
        this.any = any;
    }

    /**
     * <p>
     * A <code>ListInsightsAnyStatusFilter</code> that specifies insights of any status that are either
     * <code>REACTIVE</code> or <code>PROACTIVE</code>.
     * </p>
     * 
     * @return A <code>ListInsightsAnyStatusFilter</code> that specifies insights of any status that are either
     *         <code>REACTIVE</code> or <code>PROACTIVE</code>.
     */

    public ListInsightsAnyStatusFilter getAny() {
        return this.any;
    }

    /**
     * <p>
     * A <code>ListInsightsAnyStatusFilter</code> that specifies insights of any status that are either
     * <code>REACTIVE</code> or <code>PROACTIVE</code>.
     * </p>
     * 
     * @param any
     *        A <code>ListInsightsAnyStatusFilter</code> that specifies insights of any status that are either
     *        <code>REACTIVE</code> or <code>PROACTIVE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsStatusFilter withAny(ListInsightsAnyStatusFilter any) {
        setAny(any);
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
        if (getOngoing() != null)
            sb.append("Ongoing: ").append(getOngoing()).append(",");
        if (getClosed() != null)
            sb.append("Closed: ").append(getClosed()).append(",");
        if (getAny() != null)
            sb.append("Any: ").append(getAny());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInsightsStatusFilter == false)
            return false;
        ListInsightsStatusFilter other = (ListInsightsStatusFilter) obj;
        if (other.getOngoing() == null ^ this.getOngoing() == null)
            return false;
        if (other.getOngoing() != null && other.getOngoing().equals(this.getOngoing()) == false)
            return false;
        if (other.getClosed() == null ^ this.getClosed() == null)
            return false;
        if (other.getClosed() != null && other.getClosed().equals(this.getClosed()) == false)
            return false;
        if (other.getAny() == null ^ this.getAny() == null)
            return false;
        if (other.getAny() != null && other.getAny().equals(this.getAny()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOngoing() == null) ? 0 : getOngoing().hashCode());
        hashCode = prime * hashCode + ((getClosed() == null) ? 0 : getClosed().hashCode());
        hashCode = prime * hashCode + ((getAny() == null) ? 0 : getAny().hashCode());
        return hashCode;
    }

    @Override
    public ListInsightsStatusFilter clone() {
        try {
            return (ListInsightsStatusFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.ListInsightsStatusFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
