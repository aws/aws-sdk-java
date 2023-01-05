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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of settings that configure the <code>RStudioServerPro</code> Domain-level app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/RStudioServerProDomainSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RStudioServerProDomainSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the execution role for the <code>RStudioServerPro</code> Domain-level app.
     * </p>
     */
    private String domainExecutionRoleArn;
    /**
     * <p>
     * A URL pointing to an RStudio Connect server.
     * </p>
     */
    private String rStudioConnectUrl;
    /**
     * <p>
     * A URL pointing to an RStudio Package Manager server.
     * </p>
     */
    private String rStudioPackageManagerUrl;

    private ResourceSpec defaultResourceSpec;

    /**
     * <p>
     * The ARN of the execution role for the <code>RStudioServerPro</code> Domain-level app.
     * </p>
     * 
     * @param domainExecutionRoleArn
     *        The ARN of the execution role for the <code>RStudioServerPro</code> Domain-level app.
     */

    public void setDomainExecutionRoleArn(String domainExecutionRoleArn) {
        this.domainExecutionRoleArn = domainExecutionRoleArn;
    }

    /**
     * <p>
     * The ARN of the execution role for the <code>RStudioServerPro</code> Domain-level app.
     * </p>
     * 
     * @return The ARN of the execution role for the <code>RStudioServerPro</code> Domain-level app.
     */

    public String getDomainExecutionRoleArn() {
        return this.domainExecutionRoleArn;
    }

    /**
     * <p>
     * The ARN of the execution role for the <code>RStudioServerPro</code> Domain-level app.
     * </p>
     * 
     * @param domainExecutionRoleArn
     *        The ARN of the execution role for the <code>RStudioServerPro</code> Domain-level app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RStudioServerProDomainSettings withDomainExecutionRoleArn(String domainExecutionRoleArn) {
        setDomainExecutionRoleArn(domainExecutionRoleArn);
        return this;
    }

    /**
     * <p>
     * A URL pointing to an RStudio Connect server.
     * </p>
     * 
     * @param rStudioConnectUrl
     *        A URL pointing to an RStudio Connect server.
     */

    public void setRStudioConnectUrl(String rStudioConnectUrl) {
        this.rStudioConnectUrl = rStudioConnectUrl;
    }

    /**
     * <p>
     * A URL pointing to an RStudio Connect server.
     * </p>
     * 
     * @return A URL pointing to an RStudio Connect server.
     */

    public String getRStudioConnectUrl() {
        return this.rStudioConnectUrl;
    }

    /**
     * <p>
     * A URL pointing to an RStudio Connect server.
     * </p>
     * 
     * @param rStudioConnectUrl
     *        A URL pointing to an RStudio Connect server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RStudioServerProDomainSettings withRStudioConnectUrl(String rStudioConnectUrl) {
        setRStudioConnectUrl(rStudioConnectUrl);
        return this;
    }

    /**
     * <p>
     * A URL pointing to an RStudio Package Manager server.
     * </p>
     * 
     * @param rStudioPackageManagerUrl
     *        A URL pointing to an RStudio Package Manager server.
     */

    public void setRStudioPackageManagerUrl(String rStudioPackageManagerUrl) {
        this.rStudioPackageManagerUrl = rStudioPackageManagerUrl;
    }

    /**
     * <p>
     * A URL pointing to an RStudio Package Manager server.
     * </p>
     * 
     * @return A URL pointing to an RStudio Package Manager server.
     */

    public String getRStudioPackageManagerUrl() {
        return this.rStudioPackageManagerUrl;
    }

    /**
     * <p>
     * A URL pointing to an RStudio Package Manager server.
     * </p>
     * 
     * @param rStudioPackageManagerUrl
     *        A URL pointing to an RStudio Package Manager server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RStudioServerProDomainSettings withRStudioPackageManagerUrl(String rStudioPackageManagerUrl) {
        setRStudioPackageManagerUrl(rStudioPackageManagerUrl);
        return this;
    }

    /**
     * @param defaultResourceSpec
     */

    public void setDefaultResourceSpec(ResourceSpec defaultResourceSpec) {
        this.defaultResourceSpec = defaultResourceSpec;
    }

    /**
     * @return
     */

    public ResourceSpec getDefaultResourceSpec() {
        return this.defaultResourceSpec;
    }

    /**
     * @param defaultResourceSpec
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RStudioServerProDomainSettings withDefaultResourceSpec(ResourceSpec defaultResourceSpec) {
        setDefaultResourceSpec(defaultResourceSpec);
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
        if (getDomainExecutionRoleArn() != null)
            sb.append("DomainExecutionRoleArn: ").append(getDomainExecutionRoleArn()).append(",");
        if (getRStudioConnectUrl() != null)
            sb.append("RStudioConnectUrl: ").append(getRStudioConnectUrl()).append(",");
        if (getRStudioPackageManagerUrl() != null)
            sb.append("RStudioPackageManagerUrl: ").append(getRStudioPackageManagerUrl()).append(",");
        if (getDefaultResourceSpec() != null)
            sb.append("DefaultResourceSpec: ").append(getDefaultResourceSpec());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RStudioServerProDomainSettings == false)
            return false;
        RStudioServerProDomainSettings other = (RStudioServerProDomainSettings) obj;
        if (other.getDomainExecutionRoleArn() == null ^ this.getDomainExecutionRoleArn() == null)
            return false;
        if (other.getDomainExecutionRoleArn() != null && other.getDomainExecutionRoleArn().equals(this.getDomainExecutionRoleArn()) == false)
            return false;
        if (other.getRStudioConnectUrl() == null ^ this.getRStudioConnectUrl() == null)
            return false;
        if (other.getRStudioConnectUrl() != null && other.getRStudioConnectUrl().equals(this.getRStudioConnectUrl()) == false)
            return false;
        if (other.getRStudioPackageManagerUrl() == null ^ this.getRStudioPackageManagerUrl() == null)
            return false;
        if (other.getRStudioPackageManagerUrl() != null && other.getRStudioPackageManagerUrl().equals(this.getRStudioPackageManagerUrl()) == false)
            return false;
        if (other.getDefaultResourceSpec() == null ^ this.getDefaultResourceSpec() == null)
            return false;
        if (other.getDefaultResourceSpec() != null && other.getDefaultResourceSpec().equals(this.getDefaultResourceSpec()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainExecutionRoleArn() == null) ? 0 : getDomainExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRStudioConnectUrl() == null) ? 0 : getRStudioConnectUrl().hashCode());
        hashCode = prime * hashCode + ((getRStudioPackageManagerUrl() == null) ? 0 : getRStudioPackageManagerUrl().hashCode());
        hashCode = prime * hashCode + ((getDefaultResourceSpec() == null) ? 0 : getDefaultResourceSpec().hashCode());
        return hashCode;
    }

    @Override
    public RStudioServerProDomainSettings clone() {
        try {
            return (RStudioServerProDomainSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.RStudioServerProDomainSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
