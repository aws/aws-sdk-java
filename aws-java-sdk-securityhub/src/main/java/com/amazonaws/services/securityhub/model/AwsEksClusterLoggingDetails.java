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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The logging configuration for an Amazon EKS cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEksClusterLoggingDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEksClusterLoggingDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Cluster logging configurations.
     * </p>
     */
    private java.util.List<AwsEksClusterLoggingClusterLoggingDetails> clusterLogging;

    /**
     * <p>
     * Cluster logging configurations.
     * </p>
     * 
     * @return Cluster logging configurations.
     */

    public java.util.List<AwsEksClusterLoggingClusterLoggingDetails> getClusterLogging() {
        return clusterLogging;
    }

    /**
     * <p>
     * Cluster logging configurations.
     * </p>
     * 
     * @param clusterLogging
     *        Cluster logging configurations.
     */

    public void setClusterLogging(java.util.Collection<AwsEksClusterLoggingClusterLoggingDetails> clusterLogging) {
        if (clusterLogging == null) {
            this.clusterLogging = null;
            return;
        }

        this.clusterLogging = new java.util.ArrayList<AwsEksClusterLoggingClusterLoggingDetails>(clusterLogging);
    }

    /**
     * <p>
     * Cluster logging configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterLogging(java.util.Collection)} or {@link #withClusterLogging(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param clusterLogging
     *        Cluster logging configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEksClusterLoggingDetails withClusterLogging(AwsEksClusterLoggingClusterLoggingDetails... clusterLogging) {
        if (this.clusterLogging == null) {
            setClusterLogging(new java.util.ArrayList<AwsEksClusterLoggingClusterLoggingDetails>(clusterLogging.length));
        }
        for (AwsEksClusterLoggingClusterLoggingDetails ele : clusterLogging) {
            this.clusterLogging.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Cluster logging configurations.
     * </p>
     * 
     * @param clusterLogging
     *        Cluster logging configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEksClusterLoggingDetails withClusterLogging(java.util.Collection<AwsEksClusterLoggingClusterLoggingDetails> clusterLogging) {
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

        if (obj instanceof AwsEksClusterLoggingDetails == false)
            return false;
        AwsEksClusterLoggingDetails other = (AwsEksClusterLoggingDetails) obj;
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
    public AwsEksClusterLoggingDetails clone() {
        try {
            return (AwsEksClusterLoggingDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEksClusterLoggingDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
