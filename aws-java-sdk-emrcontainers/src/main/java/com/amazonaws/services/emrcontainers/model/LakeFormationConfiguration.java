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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lake Formation related configuration inputs for the security configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/LakeFormationConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LakeFormationConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The session tag to authorize Amazon EMR on EKS for API calls to Lake Formation.
     * </p>
     */
    private String authorizedSessionTagValue;
    /**
     * <p>
     * The namespace input of the system job.
     * </p>
     */
    private SecureNamespaceInfo secureNamespaceInfo;
    /**
     * <p>
     * The query engine IAM role ARN that is tied to the secure Spark job. The <code>QueryEngine</code> role assumes the
     * <code>JobExecutionRole</code> to execute all the Lake Formation calls.
     * </p>
     */
    private String queryEngineRoleArn;

    /**
     * <p>
     * The session tag to authorize Amazon EMR on EKS for API calls to Lake Formation.
     * </p>
     * 
     * @param authorizedSessionTagValue
     *        The session tag to authorize Amazon EMR on EKS for API calls to Lake Formation.
     */

    public void setAuthorizedSessionTagValue(String authorizedSessionTagValue) {
        this.authorizedSessionTagValue = authorizedSessionTagValue;
    }

    /**
     * <p>
     * The session tag to authorize Amazon EMR on EKS for API calls to Lake Formation.
     * </p>
     * 
     * @return The session tag to authorize Amazon EMR on EKS for API calls to Lake Formation.
     */

    public String getAuthorizedSessionTagValue() {
        return this.authorizedSessionTagValue;
    }

    /**
     * <p>
     * The session tag to authorize Amazon EMR on EKS for API calls to Lake Formation.
     * </p>
     * 
     * @param authorizedSessionTagValue
     *        The session tag to authorize Amazon EMR on EKS for API calls to Lake Formation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeFormationConfiguration withAuthorizedSessionTagValue(String authorizedSessionTagValue) {
        setAuthorizedSessionTagValue(authorizedSessionTagValue);
        return this;
    }

    /**
     * <p>
     * The namespace input of the system job.
     * </p>
     * 
     * @param secureNamespaceInfo
     *        The namespace input of the system job.
     */

    public void setSecureNamespaceInfo(SecureNamespaceInfo secureNamespaceInfo) {
        this.secureNamespaceInfo = secureNamespaceInfo;
    }

    /**
     * <p>
     * The namespace input of the system job.
     * </p>
     * 
     * @return The namespace input of the system job.
     */

    public SecureNamespaceInfo getSecureNamespaceInfo() {
        return this.secureNamespaceInfo;
    }

    /**
     * <p>
     * The namespace input of the system job.
     * </p>
     * 
     * @param secureNamespaceInfo
     *        The namespace input of the system job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeFormationConfiguration withSecureNamespaceInfo(SecureNamespaceInfo secureNamespaceInfo) {
        setSecureNamespaceInfo(secureNamespaceInfo);
        return this;
    }

    /**
     * <p>
     * The query engine IAM role ARN that is tied to the secure Spark job. The <code>QueryEngine</code> role assumes the
     * <code>JobExecutionRole</code> to execute all the Lake Formation calls.
     * </p>
     * 
     * @param queryEngineRoleArn
     *        The query engine IAM role ARN that is tied to the secure Spark job. The <code>QueryEngine</code> role
     *        assumes the <code>JobExecutionRole</code> to execute all the Lake Formation calls.
     */

    public void setQueryEngineRoleArn(String queryEngineRoleArn) {
        this.queryEngineRoleArn = queryEngineRoleArn;
    }

    /**
     * <p>
     * The query engine IAM role ARN that is tied to the secure Spark job. The <code>QueryEngine</code> role assumes the
     * <code>JobExecutionRole</code> to execute all the Lake Formation calls.
     * </p>
     * 
     * @return The query engine IAM role ARN that is tied to the secure Spark job. The <code>QueryEngine</code> role
     *         assumes the <code>JobExecutionRole</code> to execute all the Lake Formation calls.
     */

    public String getQueryEngineRoleArn() {
        return this.queryEngineRoleArn;
    }

    /**
     * <p>
     * The query engine IAM role ARN that is tied to the secure Spark job. The <code>QueryEngine</code> role assumes the
     * <code>JobExecutionRole</code> to execute all the Lake Formation calls.
     * </p>
     * 
     * @param queryEngineRoleArn
     *        The query engine IAM role ARN that is tied to the secure Spark job. The <code>QueryEngine</code> role
     *        assumes the <code>JobExecutionRole</code> to execute all the Lake Formation calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LakeFormationConfiguration withQueryEngineRoleArn(String queryEngineRoleArn) {
        setQueryEngineRoleArn(queryEngineRoleArn);
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
        if (getAuthorizedSessionTagValue() != null)
            sb.append("AuthorizedSessionTagValue: ").append(getAuthorizedSessionTagValue()).append(",");
        if (getSecureNamespaceInfo() != null)
            sb.append("SecureNamespaceInfo: ").append(getSecureNamespaceInfo()).append(",");
        if (getQueryEngineRoleArn() != null)
            sb.append("QueryEngineRoleArn: ").append(getQueryEngineRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LakeFormationConfiguration == false)
            return false;
        LakeFormationConfiguration other = (LakeFormationConfiguration) obj;
        if (other.getAuthorizedSessionTagValue() == null ^ this.getAuthorizedSessionTagValue() == null)
            return false;
        if (other.getAuthorizedSessionTagValue() != null && other.getAuthorizedSessionTagValue().equals(this.getAuthorizedSessionTagValue()) == false)
            return false;
        if (other.getSecureNamespaceInfo() == null ^ this.getSecureNamespaceInfo() == null)
            return false;
        if (other.getSecureNamespaceInfo() != null && other.getSecureNamespaceInfo().equals(this.getSecureNamespaceInfo()) == false)
            return false;
        if (other.getQueryEngineRoleArn() == null ^ this.getQueryEngineRoleArn() == null)
            return false;
        if (other.getQueryEngineRoleArn() != null && other.getQueryEngineRoleArn().equals(this.getQueryEngineRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthorizedSessionTagValue() == null) ? 0 : getAuthorizedSessionTagValue().hashCode());
        hashCode = prime * hashCode + ((getSecureNamespaceInfo() == null) ? 0 : getSecureNamespaceInfo().hashCode());
        hashCode = prime * hashCode + ((getQueryEngineRoleArn() == null) ? 0 : getQueryEngineRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public LakeFormationConfiguration clone() {
        try {
            return (LakeFormationConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.LakeFormationConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
