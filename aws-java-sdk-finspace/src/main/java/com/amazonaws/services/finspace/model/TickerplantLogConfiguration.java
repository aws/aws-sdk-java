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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A configuration to store the Tickerplant logs. It consists of a list of volumes that will be mounted to your cluster.
 * For the cluster type <code>Tickerplant</code>, the location of the TP volume on the cluster will be available by
 * using the global variable <code>.aws.tp_log_path</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/TickerplantLogConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TickerplantLogConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the volumes for tickerplant logs.
     * </p>
     */
    private java.util.List<String> tickerplantLogVolumes;

    /**
     * <p>
     * The name of the volumes for tickerplant logs.
     * </p>
     * 
     * @return The name of the volumes for tickerplant logs.
     */

    public java.util.List<String> getTickerplantLogVolumes() {
        return tickerplantLogVolumes;
    }

    /**
     * <p>
     * The name of the volumes for tickerplant logs.
     * </p>
     * 
     * @param tickerplantLogVolumes
     *        The name of the volumes for tickerplant logs.
     */

    public void setTickerplantLogVolumes(java.util.Collection<String> tickerplantLogVolumes) {
        if (tickerplantLogVolumes == null) {
            this.tickerplantLogVolumes = null;
            return;
        }

        this.tickerplantLogVolumes = new java.util.ArrayList<String>(tickerplantLogVolumes);
    }

    /**
     * <p>
     * The name of the volumes for tickerplant logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTickerplantLogVolumes(java.util.Collection)} or
     * {@link #withTickerplantLogVolumes(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param tickerplantLogVolumes
     *        The name of the volumes for tickerplant logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TickerplantLogConfiguration withTickerplantLogVolumes(String... tickerplantLogVolumes) {
        if (this.tickerplantLogVolumes == null) {
            setTickerplantLogVolumes(new java.util.ArrayList<String>(tickerplantLogVolumes.length));
        }
        for (String ele : tickerplantLogVolumes) {
            this.tickerplantLogVolumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the volumes for tickerplant logs.
     * </p>
     * 
     * @param tickerplantLogVolumes
     *        The name of the volumes for tickerplant logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TickerplantLogConfiguration withTickerplantLogVolumes(java.util.Collection<String> tickerplantLogVolumes) {
        setTickerplantLogVolumes(tickerplantLogVolumes);
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
        if (getTickerplantLogVolumes() != null)
            sb.append("TickerplantLogVolumes: ").append(getTickerplantLogVolumes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TickerplantLogConfiguration == false)
            return false;
        TickerplantLogConfiguration other = (TickerplantLogConfiguration) obj;
        if (other.getTickerplantLogVolumes() == null ^ this.getTickerplantLogVolumes() == null)
            return false;
        if (other.getTickerplantLogVolumes() != null && other.getTickerplantLogVolumes().equals(this.getTickerplantLogVolumes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTickerplantLogVolumes() == null) ? 0 : getTickerplantLogVolumes().hashCode());
        return hashCode;
    }

    @Override
    public TickerplantLogConfiguration clone() {
        try {
            return (TickerplantLogConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.TickerplantLogConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
