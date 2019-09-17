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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Represents the output of a BatchGetOnPremisesInstances operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetOnPremisesInstances"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetOnPremisesInstancesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the on-premises instances.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceInfo> instanceInfos;

    /**
     * <p>
     * Information about the on-premises instances.
     * </p>
     * 
     * @return Information about the on-premises instances.
     */

    public java.util.List<InstanceInfo> getInstanceInfos() {
        if (instanceInfos == null) {
            instanceInfos = new com.amazonaws.internal.SdkInternalList<InstanceInfo>();
        }
        return instanceInfos;
    }

    /**
     * <p>
     * Information about the on-premises instances.
     * </p>
     * 
     * @param instanceInfos
     *        Information about the on-premises instances.
     */

    public void setInstanceInfos(java.util.Collection<InstanceInfo> instanceInfos) {
        if (instanceInfos == null) {
            this.instanceInfos = null;
            return;
        }

        this.instanceInfos = new com.amazonaws.internal.SdkInternalList<InstanceInfo>(instanceInfos);
    }

    /**
     * <p>
     * Information about the on-premises instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceInfos(java.util.Collection)} or {@link #withInstanceInfos(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param instanceInfos
     *        Information about the on-premises instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetOnPremisesInstancesResult withInstanceInfos(InstanceInfo... instanceInfos) {
        if (this.instanceInfos == null) {
            setInstanceInfos(new com.amazonaws.internal.SdkInternalList<InstanceInfo>(instanceInfos.length));
        }
        for (InstanceInfo ele : instanceInfos) {
            this.instanceInfos.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the on-premises instances.
     * </p>
     * 
     * @param instanceInfos
     *        Information about the on-premises instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetOnPremisesInstancesResult withInstanceInfos(java.util.Collection<InstanceInfo> instanceInfos) {
        setInstanceInfos(instanceInfos);
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
        if (getInstanceInfos() != null)
            sb.append("InstanceInfos: ").append(getInstanceInfos());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetOnPremisesInstancesResult == false)
            return false;
        BatchGetOnPremisesInstancesResult other = (BatchGetOnPremisesInstancesResult) obj;
        if (other.getInstanceInfos() == null ^ this.getInstanceInfos() == null)
            return false;
        if (other.getInstanceInfos() != null && other.getInstanceInfos().equals(this.getInstanceInfos()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceInfos() == null) ? 0 : getInstanceInfos().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetOnPremisesInstancesResult clone() {
        try {
            return (BatchGetOnPremisesInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
