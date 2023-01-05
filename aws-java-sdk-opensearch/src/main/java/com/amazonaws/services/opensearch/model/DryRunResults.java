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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Results of a dry run performed in an update domain request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DryRunResults implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the way in which OpenSearch Service will apply an update. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Blue/Green</b> - The update requires a blue/green deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DynamicUpdate</b> - No blue/green deployment required
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Undetermined</b> - The domain is in the middle of an update and can't predict the deployment type. Try again
     * after the update is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>None</b> - The request doesn't include any configuration changes.
     * </p>
     * </li>
     * </ul>
     */
    private String deploymentType;
    /**
     * <p>
     * A message corresponding to the deployment type.
     * </p>
     */
    private String message;

    /**
     * <p>
     * Specifies the way in which OpenSearch Service will apply an update. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Blue/Green</b> - The update requires a blue/green deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DynamicUpdate</b> - No blue/green deployment required
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Undetermined</b> - The domain is in the middle of an update and can't predict the deployment type. Try again
     * after the update is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>None</b> - The request doesn't include any configuration changes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deploymentType
     *        Specifies the way in which OpenSearch Service will apply an update. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Blue/Green</b> - The update requires a blue/green deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DynamicUpdate</b> - No blue/green deployment required
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Undetermined</b> - The domain is in the middle of an update and can't predict the deployment type. Try
     *        again after the update is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>None</b> - The request doesn't include any configuration changes.
     *        </p>
     *        </li>
     */

    public void setDeploymentType(String deploymentType) {
        this.deploymentType = deploymentType;
    }

    /**
     * <p>
     * Specifies the way in which OpenSearch Service will apply an update. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Blue/Green</b> - The update requires a blue/green deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DynamicUpdate</b> - No blue/green deployment required
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Undetermined</b> - The domain is in the middle of an update and can't predict the deployment type. Try again
     * after the update is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>None</b> - The request doesn't include any configuration changes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the way in which OpenSearch Service will apply an update. Possible values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Blue/Green</b> - The update requires a blue/green deployment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DynamicUpdate</b> - No blue/green deployment required
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Undetermined</b> - The domain is in the middle of an update and can't predict the deployment type. Try
     *         again after the update is complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>None</b> - The request doesn't include any configuration changes.
     *         </p>
     *         </li>
     */

    public String getDeploymentType() {
        return this.deploymentType;
    }

    /**
     * <p>
     * Specifies the way in which OpenSearch Service will apply an update. Possible values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Blue/Green</b> - The update requires a blue/green deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DynamicUpdate</b> - No blue/green deployment required
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Undetermined</b> - The domain is in the middle of an update and can't predict the deployment type. Try again
     * after the update is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>None</b> - The request doesn't include any configuration changes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param deploymentType
     *        Specifies the way in which OpenSearch Service will apply an update. Possible values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Blue/Green</b> - The update requires a blue/green deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DynamicUpdate</b> - No blue/green deployment required
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Undetermined</b> - The domain is in the middle of an update and can't predict the deployment type. Try
     *        again after the update is complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>None</b> - The request doesn't include any configuration changes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DryRunResults withDeploymentType(String deploymentType) {
        setDeploymentType(deploymentType);
        return this;
    }

    /**
     * <p>
     * A message corresponding to the deployment type.
     * </p>
     * 
     * @param message
     *        A message corresponding to the deployment type.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * A message corresponding to the deployment type.
     * </p>
     * 
     * @return A message corresponding to the deployment type.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * A message corresponding to the deployment type.
     * </p>
     * 
     * @param message
     *        A message corresponding to the deployment type.
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
        com.amazonaws.services.opensearch.model.transform.DryRunResultsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
