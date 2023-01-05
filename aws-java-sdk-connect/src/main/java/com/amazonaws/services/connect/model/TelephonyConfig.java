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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The distribution of traffic between the instance and its replicas.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/TelephonyConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TelephonyConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about traffic distributions.
     * </p>
     */
    private java.util.List<Distribution> distributions;

    /**
     * <p>
     * Information about traffic distributions.
     * </p>
     * 
     * @return Information about traffic distributions.
     */

    public java.util.List<Distribution> getDistributions() {
        return distributions;
    }

    /**
     * <p>
     * Information about traffic distributions.
     * </p>
     * 
     * @param distributions
     *        Information about traffic distributions.
     */

    public void setDistributions(java.util.Collection<Distribution> distributions) {
        if (distributions == null) {
            this.distributions = null;
            return;
        }

        this.distributions = new java.util.ArrayList<Distribution>(distributions);
    }

    /**
     * <p>
     * Information about traffic distributions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDistributions(java.util.Collection)} or {@link #withDistributions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param distributions
     *        Information about traffic distributions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TelephonyConfig withDistributions(Distribution... distributions) {
        if (this.distributions == null) {
            setDistributions(new java.util.ArrayList<Distribution>(distributions.length));
        }
        for (Distribution ele : distributions) {
            this.distributions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about traffic distributions.
     * </p>
     * 
     * @param distributions
     *        Information about traffic distributions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TelephonyConfig withDistributions(java.util.Collection<Distribution> distributions) {
        setDistributions(distributions);
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
        if (getDistributions() != null)
            sb.append("Distributions: ").append(getDistributions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TelephonyConfig == false)
            return false;
        TelephonyConfig other = (TelephonyConfig) obj;
        if (other.getDistributions() == null ^ this.getDistributions() == null)
            return false;
        if (other.getDistributions() != null && other.getDistributions().equals(this.getDistributions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistributions() == null) ? 0 : getDistributions().hashCode());
        return hashCode;
    }

    @Override
    public TelephonyConfig clone() {
        try {
            return (TelephonyConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.TelephonyConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
