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
 * Represents the output of a BatchGetDeployments operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/BatchGetDeployments" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetDeploymentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the deployments.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DeploymentInfo> deploymentsInfo;

    /**
     * <p>
     * Information about the deployments.
     * </p>
     * 
     * @return Information about the deployments.
     */

    public java.util.List<DeploymentInfo> getDeploymentsInfo() {
        if (deploymentsInfo == null) {
            deploymentsInfo = new com.amazonaws.internal.SdkInternalList<DeploymentInfo>();
        }
        return deploymentsInfo;
    }

    /**
     * <p>
     * Information about the deployments.
     * </p>
     * 
     * @param deploymentsInfo
     *        Information about the deployments.
     */

    public void setDeploymentsInfo(java.util.Collection<DeploymentInfo> deploymentsInfo) {
        if (deploymentsInfo == null) {
            this.deploymentsInfo = null;
            return;
        }

        this.deploymentsInfo = new com.amazonaws.internal.SdkInternalList<DeploymentInfo>(deploymentsInfo);
    }

    /**
     * <p>
     * Information about the deployments.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeploymentsInfo(java.util.Collection)} or {@link #withDeploymentsInfo(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param deploymentsInfo
     *        Information about the deployments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDeploymentsResult withDeploymentsInfo(DeploymentInfo... deploymentsInfo) {
        if (this.deploymentsInfo == null) {
            setDeploymentsInfo(new com.amazonaws.internal.SdkInternalList<DeploymentInfo>(deploymentsInfo.length));
        }
        for (DeploymentInfo ele : deploymentsInfo) {
            this.deploymentsInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the deployments.
     * </p>
     * 
     * @param deploymentsInfo
     *        Information about the deployments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetDeploymentsResult withDeploymentsInfo(java.util.Collection<DeploymentInfo> deploymentsInfo) {
        setDeploymentsInfo(deploymentsInfo);
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
        if (getDeploymentsInfo() != null)
            sb.append("DeploymentsInfo: ").append(getDeploymentsInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDeploymentsResult == false)
            return false;
        BatchGetDeploymentsResult other = (BatchGetDeploymentsResult) obj;
        if (other.getDeploymentsInfo() == null ^ this.getDeploymentsInfo() == null)
            return false;
        if (other.getDeploymentsInfo() != null && other.getDeploymentsInfo().equals(this.getDeploymentsInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentsInfo() == null) ? 0 : getDeploymentsInfo().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetDeploymentsResult clone() {
        try {
            return (BatchGetDeploymentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
