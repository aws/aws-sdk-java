/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Extended textual information about the finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/FindingDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FindingDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the CloudFormation stack creation or update associated with the finding.
     * </p>
     */
    private CloudFormationStackUpdate cloudFormationStackUpdate;
    /**
     * <p>
     * Information about the CodeDeploy deployment associated with the finding.
     * </p>
     */
    private CodeDeployDeployment codeDeployDeployment;

    /**
     * <p>
     * Information about the CloudFormation stack creation or update associated with the finding.
     * </p>
     * 
     * @param cloudFormationStackUpdate
     *        Information about the CloudFormation stack creation or update associated with the finding.
     */

    public void setCloudFormationStackUpdate(CloudFormationStackUpdate cloudFormationStackUpdate) {
        this.cloudFormationStackUpdate = cloudFormationStackUpdate;
    }

    /**
     * <p>
     * Information about the CloudFormation stack creation or update associated with the finding.
     * </p>
     * 
     * @return Information about the CloudFormation stack creation or update associated with the finding.
     */

    public CloudFormationStackUpdate getCloudFormationStackUpdate() {
        return this.cloudFormationStackUpdate;
    }

    /**
     * <p>
     * Information about the CloudFormation stack creation or update associated with the finding.
     * </p>
     * 
     * @param cloudFormationStackUpdate
     *        Information about the CloudFormation stack creation or update associated with the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetails withCloudFormationStackUpdate(CloudFormationStackUpdate cloudFormationStackUpdate) {
        setCloudFormationStackUpdate(cloudFormationStackUpdate);
        return this;
    }

    /**
     * <p>
     * Information about the CodeDeploy deployment associated with the finding.
     * </p>
     * 
     * @param codeDeployDeployment
     *        Information about the CodeDeploy deployment associated with the finding.
     */

    public void setCodeDeployDeployment(CodeDeployDeployment codeDeployDeployment) {
        this.codeDeployDeployment = codeDeployDeployment;
    }

    /**
     * <p>
     * Information about the CodeDeploy deployment associated with the finding.
     * </p>
     * 
     * @return Information about the CodeDeploy deployment associated with the finding.
     */

    public CodeDeployDeployment getCodeDeployDeployment() {
        return this.codeDeployDeployment;
    }

    /**
     * <p>
     * Information about the CodeDeploy deployment associated with the finding.
     * </p>
     * 
     * @param codeDeployDeployment
     *        Information about the CodeDeploy deployment associated with the finding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FindingDetails withCodeDeployDeployment(CodeDeployDeployment codeDeployDeployment) {
        setCodeDeployDeployment(codeDeployDeployment);
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
        if (getCloudFormationStackUpdate() != null)
            sb.append("CloudFormationStackUpdate: ").append(getCloudFormationStackUpdate()).append(",");
        if (getCodeDeployDeployment() != null)
            sb.append("CodeDeployDeployment: ").append(getCodeDeployDeployment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FindingDetails == false)
            return false;
        FindingDetails other = (FindingDetails) obj;
        if (other.getCloudFormationStackUpdate() == null ^ this.getCloudFormationStackUpdate() == null)
            return false;
        if (other.getCloudFormationStackUpdate() != null && other.getCloudFormationStackUpdate().equals(this.getCloudFormationStackUpdate()) == false)
            return false;
        if (other.getCodeDeployDeployment() == null ^ this.getCodeDeployDeployment() == null)
            return false;
        if (other.getCodeDeployDeployment() != null && other.getCodeDeployDeployment().equals(this.getCodeDeployDeployment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudFormationStackUpdate() == null) ? 0 : getCloudFormationStackUpdate().hashCode());
        hashCode = prime * hashCode + ((getCodeDeployDeployment() == null) ? 0 : getCodeDeployDeployment().hashCode());
        return hashCode;
    }

    @Override
    public FindingDetails clone() {
        try {
            return (FindingDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.FindingDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
