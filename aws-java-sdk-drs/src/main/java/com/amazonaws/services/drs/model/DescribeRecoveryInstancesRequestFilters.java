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
package com.amazonaws.services.drs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of filters by which to return Recovery Instances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/drs-2020-02-26/DescribeRecoveryInstancesRequestFilters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRecoveryInstancesRequestFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of Recovery Instance IDs that should be returned. An empty array means all Recovery Instances.
     * </p>
     */
    private java.util.List<String> recoveryInstanceIDs;
    /**
     * <p>
     * An array of Source Server IDs for which associated Recovery Instances should be returned.
     * </p>
     */
    private java.util.List<String> sourceServerIDs;

    /**
     * <p>
     * An array of Recovery Instance IDs that should be returned. An empty array means all Recovery Instances.
     * </p>
     * 
     * @return An array of Recovery Instance IDs that should be returned. An empty array means all Recovery Instances.
     */

    public java.util.List<String> getRecoveryInstanceIDs() {
        return recoveryInstanceIDs;
    }

    /**
     * <p>
     * An array of Recovery Instance IDs that should be returned. An empty array means all Recovery Instances.
     * </p>
     * 
     * @param recoveryInstanceIDs
     *        An array of Recovery Instance IDs that should be returned. An empty array means all Recovery Instances.
     */

    public void setRecoveryInstanceIDs(java.util.Collection<String> recoveryInstanceIDs) {
        if (recoveryInstanceIDs == null) {
            this.recoveryInstanceIDs = null;
            return;
        }

        this.recoveryInstanceIDs = new java.util.ArrayList<String>(recoveryInstanceIDs);
    }

    /**
     * <p>
     * An array of Recovery Instance IDs that should be returned. An empty array means all Recovery Instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecoveryInstanceIDs(java.util.Collection)} or {@link #withRecoveryInstanceIDs(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param recoveryInstanceIDs
     *        An array of Recovery Instance IDs that should be returned. An empty array means all Recovery Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryInstancesRequestFilters withRecoveryInstanceIDs(String... recoveryInstanceIDs) {
        if (this.recoveryInstanceIDs == null) {
            setRecoveryInstanceIDs(new java.util.ArrayList<String>(recoveryInstanceIDs.length));
        }
        for (String ele : recoveryInstanceIDs) {
            this.recoveryInstanceIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Recovery Instance IDs that should be returned. An empty array means all Recovery Instances.
     * </p>
     * 
     * @param recoveryInstanceIDs
     *        An array of Recovery Instance IDs that should be returned. An empty array means all Recovery Instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryInstancesRequestFilters withRecoveryInstanceIDs(java.util.Collection<String> recoveryInstanceIDs) {
        setRecoveryInstanceIDs(recoveryInstanceIDs);
        return this;
    }

    /**
     * <p>
     * An array of Source Server IDs for which associated Recovery Instances should be returned.
     * </p>
     * 
     * @return An array of Source Server IDs for which associated Recovery Instances should be returned.
     */

    public java.util.List<String> getSourceServerIDs() {
        return sourceServerIDs;
    }

    /**
     * <p>
     * An array of Source Server IDs for which associated Recovery Instances should be returned.
     * </p>
     * 
     * @param sourceServerIDs
     *        An array of Source Server IDs for which associated Recovery Instances should be returned.
     */

    public void setSourceServerIDs(java.util.Collection<String> sourceServerIDs) {
        if (sourceServerIDs == null) {
            this.sourceServerIDs = null;
            return;
        }

        this.sourceServerIDs = new java.util.ArrayList<String>(sourceServerIDs);
    }

    /**
     * <p>
     * An array of Source Server IDs for which associated Recovery Instances should be returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSourceServerIDs(java.util.Collection)} or {@link #withSourceServerIDs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sourceServerIDs
     *        An array of Source Server IDs for which associated Recovery Instances should be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryInstancesRequestFilters withSourceServerIDs(String... sourceServerIDs) {
        if (this.sourceServerIDs == null) {
            setSourceServerIDs(new java.util.ArrayList<String>(sourceServerIDs.length));
        }
        for (String ele : sourceServerIDs) {
            this.sourceServerIDs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Source Server IDs for which associated Recovery Instances should be returned.
     * </p>
     * 
     * @param sourceServerIDs
     *        An array of Source Server IDs for which associated Recovery Instances should be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecoveryInstancesRequestFilters withSourceServerIDs(java.util.Collection<String> sourceServerIDs) {
        setSourceServerIDs(sourceServerIDs);
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
        if (getRecoveryInstanceIDs() != null)
            sb.append("RecoveryInstanceIDs: ").append(getRecoveryInstanceIDs()).append(",");
        if (getSourceServerIDs() != null)
            sb.append("SourceServerIDs: ").append(getSourceServerIDs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRecoveryInstancesRequestFilters == false)
            return false;
        DescribeRecoveryInstancesRequestFilters other = (DescribeRecoveryInstancesRequestFilters) obj;
        if (other.getRecoveryInstanceIDs() == null ^ this.getRecoveryInstanceIDs() == null)
            return false;
        if (other.getRecoveryInstanceIDs() != null && other.getRecoveryInstanceIDs().equals(this.getRecoveryInstanceIDs()) == false)
            return false;
        if (other.getSourceServerIDs() == null ^ this.getSourceServerIDs() == null)
            return false;
        if (other.getSourceServerIDs() != null && other.getSourceServerIDs().equals(this.getSourceServerIDs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecoveryInstanceIDs() == null) ? 0 : getRecoveryInstanceIDs().hashCode());
        hashCode = prime * hashCode + ((getSourceServerIDs() == null) ? 0 : getSourceServerIDs().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRecoveryInstancesRequestFilters clone() {
        try {
            return (DescribeRecoveryInstancesRequestFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.drs.model.transform.DescribeRecoveryInstancesRequestFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
