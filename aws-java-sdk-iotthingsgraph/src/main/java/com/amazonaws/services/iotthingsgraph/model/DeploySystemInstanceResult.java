/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/DeploySystemInstance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploySystemInstanceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that contains summary information about a system instance that was deployed.
     * </p>
     */
    private SystemInstanceSummary summary;
    /**
     * <p>
     * The ID of the Greengrass deployment used to deploy the system instance.
     * </p>
     */
    private String greengrassDeploymentId;

    /**
     * <p>
     * An object that contains summary information about a system instance that was deployed.
     * </p>
     * 
     * @param summary
     *        An object that contains summary information about a system instance that was deployed.
     */

    public void setSummary(SystemInstanceSummary summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * An object that contains summary information about a system instance that was deployed.
     * </p>
     * 
     * @return An object that contains summary information about a system instance that was deployed.
     */

    public SystemInstanceSummary getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * An object that contains summary information about a system instance that was deployed.
     * </p>
     * 
     * @param summary
     *        An object that contains summary information about a system instance that was deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploySystemInstanceResult withSummary(SystemInstanceSummary summary) {
        setSummary(summary);
        return this;
    }

    /**
     * <p>
     * The ID of the Greengrass deployment used to deploy the system instance.
     * </p>
     * 
     * @param greengrassDeploymentId
     *        The ID of the Greengrass deployment used to deploy the system instance.
     */

    public void setGreengrassDeploymentId(String greengrassDeploymentId) {
        this.greengrassDeploymentId = greengrassDeploymentId;
    }

    /**
     * <p>
     * The ID of the Greengrass deployment used to deploy the system instance.
     * </p>
     * 
     * @return The ID of the Greengrass deployment used to deploy the system instance.
     */

    public String getGreengrassDeploymentId() {
        return this.greengrassDeploymentId;
    }

    /**
     * <p>
     * The ID of the Greengrass deployment used to deploy the system instance.
     * </p>
     * 
     * @param greengrassDeploymentId
     *        The ID of the Greengrass deployment used to deploy the system instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploySystemInstanceResult withGreengrassDeploymentId(String greengrassDeploymentId) {
        setGreengrassDeploymentId(greengrassDeploymentId);
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
        if (getSummary() != null)
            sb.append("Summary: ").append(getSummary()).append(",");
        if (getGreengrassDeploymentId() != null)
            sb.append("GreengrassDeploymentId: ").append(getGreengrassDeploymentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploySystemInstanceResult == false)
            return false;
        DeploySystemInstanceResult other = (DeploySystemInstanceResult) obj;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null && other.getSummary().equals(this.getSummary()) == false)
            return false;
        if (other.getGreengrassDeploymentId() == null ^ this.getGreengrassDeploymentId() == null)
            return false;
        if (other.getGreengrassDeploymentId() != null && other.getGreengrassDeploymentId().equals(this.getGreengrassDeploymentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime * hashCode + ((getGreengrassDeploymentId() == null) ? 0 : getGreengrassDeploymentId().hashCode());
        return hashCode;
    }

    @Override
    public DeploySystemInstanceResult clone() {
        try {
            return (DeploySystemInstanceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
