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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the logging configuration for resources in your cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/Logging" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Logging implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The cluster control plane logging configuration for your cluster.
     * </p>
     */
    private java.util.List<LogSetup> clusterLogging;

    /**
     * <p>
     * The cluster control plane logging configuration for your cluster.
     * </p>
     * 
     * @return The cluster control plane logging configuration for your cluster.
     */

    public java.util.List<LogSetup> getClusterLogging() {
        return clusterLogging;
    }

    /**
     * <p>
     * The cluster control plane logging configuration for your cluster.
     * </p>
     * 
     * @param clusterLogging
     *        The cluster control plane logging configuration for your cluster.
     */

    public void setClusterLogging(java.util.Collection<LogSetup> clusterLogging) {
        if (clusterLogging == null) {
            this.clusterLogging = null;
            return;
        }

        this.clusterLogging = new java.util.ArrayList<LogSetup>(clusterLogging);
    }

    /**
     * <p>
     * The cluster control plane logging configuration for your cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterLogging(java.util.Collection)} or {@link #withClusterLogging(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param clusterLogging
     *        The cluster control plane logging configuration for your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Logging withClusterLogging(LogSetup... clusterLogging) {
        if (this.clusterLogging == null) {
            setClusterLogging(new java.util.ArrayList<LogSetup>(clusterLogging.length));
        }
        for (LogSetup ele : clusterLogging) {
            this.clusterLogging.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The cluster control plane logging configuration for your cluster.
     * </p>
     * 
     * @param clusterLogging
     *        The cluster control plane logging configuration for your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Logging withClusterLogging(java.util.Collection<LogSetup> clusterLogging) {
        setClusterLogging(clusterLogging);
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
        if (getClusterLogging() != null)
            sb.append("ClusterLogging: ").append(getClusterLogging());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Logging == false)
            return false;
        Logging other = (Logging) obj;
        if (other.getClusterLogging() == null ^ this.getClusterLogging() == null)
            return false;
        if (other.getClusterLogging() != null && other.getClusterLogging().equals(this.getClusterLogging()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterLogging() == null) ? 0 : getClusterLogging().hashCode());
        return hashCode;
    }

    @Override
    public Logging clone() {
        try {
            return (Logging) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.LoggingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
