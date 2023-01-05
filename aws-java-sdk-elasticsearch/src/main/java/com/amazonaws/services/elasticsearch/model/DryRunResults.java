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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DryRunResults implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the deployment mechanism through which the update shall be applied on the domain. Possible responses
     * are <code>Blue/Green</code> (The update will require a blue/green deployment.) <code>DynamicUpdate</code> (The
     * update can be applied in-place without a Blue/Green deployment required.) <code>Undetermined</code> (The domain
     * is undergoing an update which needs to complete before the deployment type can be predicted.) <code>None</code>
     * (The configuration change matches the current configuration and will not result in any update.)
     * </p>
     */
    private String deploymentType;
    /**
     * <p>
     * Contains an optional message associated with the DryRunResults.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Specifies the deployment mechanism through which the update shall be applied on the domain. Possible responses
     * are <code>Blue/Green</code> (The update will require a blue/green deployment.) <code>DynamicUpdate</code> (The
     * update can be applied in-place without a Blue/Green deployment required.) <code>Undetermined</code> (The domain
     * is undergoing an update which needs to complete before the deployment type can be predicted.) <code>None</code>
     * (The configuration change matches the current configuration and will not result in any update.)
     * </p>
     * 
     * @param deploymentType
     *        Specifies the deployment mechanism through which the update shall be applied on the domain. Possible
     *        responses are <code>Blue/Green</code> (The update will require a blue/green deployment.)
     *        <code>DynamicUpdate</code> (The update can be applied in-place without a Blue/Green deployment required.)
     *        <code>Undetermined</code> (The domain is undergoing an update which needs to complete before the
     *        deployment type can be predicted.) <code>None</code> (The configuration change matches the current
     *        configuration and will not result in any update.)
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * Specifies the deployment mechanism through which the update shall be applied on the domain. Possible responses
     * are <code>Blue/Green</code> (The update will require a blue/green deployment.) <code>DynamicUpdate</code> (The
     * update can be applied in-place without a Blue/Green deployment required.) <code>Undetermined</code> (The domain
     * is undergoing an update which needs to complete before the deployment type can be predicted.) <code>None</code>
     * (The configuration change matches the current configuration and will not result in any update.)
     * </p>
     * 
     * @return Specifies the deployment mechanism through which the update shall be applied on the domain. Possible
     *         responses are <code>Blue/Green</code> (The update will require a blue/green deployment.)
     *         <code>DynamicUpdate</code> (The update can be applied in-place without a Blue/Green deployment required.)
     *         <code>Undetermined</code> (The domain is undergoing an update which needs to complete before the
     *         deployment type can be predicted.) <code>None</code> (The configuration change matches the current
     *         configuration and will not result in any update.)
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * Specifies the deployment mechanism through which the update shall be applied on the domain. Possible responses
     * are <code>Blue/Green</code> (The update will require a blue/green deployment.) <code>DynamicUpdate</code> (The
     * update can be applied in-place without a Blue/Green deployment required.) <code>Undetermined</code> (The domain
     * is undergoing an update which needs to complete before the deployment type can be predicted.) <code>None</code>
     * (The configuration change matches the current configuration and will not result in any update.)
     * </p>
     * 
     * @param deploymentType
     *        Specifies the deployment mechanism through which the update shall be applied on the domain. Possible
     *        responses are <code>Blue/Green</code> (The update will require a blue/green deployment.)
     *        <code>DynamicUpdate</code> (The update can be applied in-place without a Blue/Green deployment required.)
     *        <code>Undetermined</code> (The domain is undergoing an update which needs to complete before the
     *        deployment type can be predicted.) <code>None</code> (The configuration change matches the current
     *        configuration and will not result in any update.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DryRunResults withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * Contains an optional message associated with the DryRunResults.
     * </p>
     * 
     * @param message
     *        Contains an optional message associated with the DryRunResults.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Contains an optional message associated with the DryRunResults.
     * </p>
     * 
     * @return Contains an optional message associated with the DryRunResults.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Contains an optional message associated with the DryRunResults.
     * </p>
     * 
     * @param message
     *        Contains an optional message associated with the DryRunResults.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DryRunResults withMessage(String message) {
        setMessage(message);
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
        if (getDeploymentType() != null)
            sb.append("DeploymentType: ").append(getDeploymentType()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DryRunResults == false)
            return false;
        DryRunResults other = (DryRunResults) obj;
        if (other.getDeploymentType() == null ^ this.getDeploymentType() == null)
            return false;
        if (other.getDeploymentType() != null && other.getDeploymentType().equals(this.getDeploymentType()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentType() == null) ? 0 : getDeploymentType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public DryRunResults clone() {
        try {
            return (DryRunResults) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.DryRunResultsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
