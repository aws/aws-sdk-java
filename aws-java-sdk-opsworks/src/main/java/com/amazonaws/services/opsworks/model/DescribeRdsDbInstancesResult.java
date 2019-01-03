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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a <code>DescribeRdsDbInstances</code> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DescribeRdsDbInstances" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRdsDbInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An a array of <code>RdsDbInstance</code> objects that describe the instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<RdsDbInstance> rdsDbInstances;

    /**
     * <p>
     * An a array of <code>RdsDbInstance</code> objects that describe the instances.
     * </p>
     * 
     * @return An a array of <code>RdsDbInstance</code> objects that describe the instances.
     */

    public java.util.List<RdsDbInstance> getRdsDbInstances() {
        if (rdsDbInstances == null) {
            rdsDbInstances = new com.amazonaws.internal.SdkInternalList<RdsDbInstance>();
        }
        return rdsDbInstances;
    }

    /**
     * <p>
     * An a array of <code>RdsDbInstance</code> objects that describe the instances.
     * </p>
     * 
     * @param rdsDbInstances
     *        An a array of <code>RdsDbInstance</code> objects that describe the instances.
     */

    public void setRdsDbInstances(java.util.Collection<RdsDbInstance> rdsDbInstances) {
        if (rdsDbInstances == null) {
            this.rdsDbInstances = null;
            return;
        }

        this.rdsDbInstances = new com.amazonaws.internal.SdkInternalList<RdsDbInstance>(rdsDbInstances);
    }

    /**
     * <p>
     * An a array of <code>RdsDbInstance</code> objects that describe the instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRdsDbInstances(java.util.Collection)} or {@link #withRdsDbInstances(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param rdsDbInstances
     *        An a array of <code>RdsDbInstance</code> objects that describe the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRdsDbInstancesResult withRdsDbInstances(RdsDbInstance... rdsDbInstances) {
        if (this.rdsDbInstances == null) {
            setRdsDbInstances(new com.amazonaws.internal.SdkInternalList<RdsDbInstance>(rdsDbInstances.length));
        }
        for (RdsDbInstance ele : rdsDbInstances) {
            this.rdsDbInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An a array of <code>RdsDbInstance</code> objects that describe the instances.
     * </p>
     * 
     * @param rdsDbInstances
     *        An a array of <code>RdsDbInstance</code> objects that describe the instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRdsDbInstancesResult withRdsDbInstances(java.util.Collection<RdsDbInstance> rdsDbInstances) {
        setRdsDbInstances(rdsDbInstances);
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
        if (getRdsDbInstances() != null)
            sb.append("RdsDbInstances: ").append(getRdsDbInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRdsDbInstancesResult == false)
            return false;
        DescribeRdsDbInstancesResult other = (DescribeRdsDbInstancesResult) obj;
        if (other.getRdsDbInstances() == null ^ this.getRdsDbInstances() == null)
            return false;
        if (other.getRdsDbInstances() != null && other.getRdsDbInstances().equals(this.getRdsDbInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRdsDbInstances() == null) ? 0 : getRdsDbInstances().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRdsDbInstancesResult clone() {
        try {
            return (DescribeRdsDbInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
