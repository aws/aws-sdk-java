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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The settings for the JupyterLab application within a space.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/SpaceJupyterLabAppSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpaceJupyterLabAppSettings implements Serializable, Cloneable, StructuredPojo {

    private ResourceSpec defaultResourceSpec;
    /**
     * <p>
     * A list of Git repositories that SageMaker automatically displays to users for cloning in the JupyterLab
     * application.
     * </p>
     */
    private java.util.List<CodeRepository> codeRepositories;

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

    public SpaceJupyterLabAppSettings withDefaultResourceSpec(ResourceSpec defaultResourceSpec) {
        setDefaultResourceSpec(defaultResourceSpec);
        return this;
    }

    /**
     * <p>
     * A list of Git repositories that SageMaker automatically displays to users for cloning in the JupyterLab
     * application.
     * </p>
     * 
     * @return A list of Git repositories that SageMaker automatically displays to users for cloning in the JupyterLab
     *         application.
     */

    public java.util.List<CodeRepository> getCodeRepositories() {
        return codeRepositories;
    }

    /**
     * <p>
     * A list of Git repositories that SageMaker automatically displays to users for cloning in the JupyterLab
     * application.
     * </p>
     * 
     * @param codeRepositories
     *        A list of Git repositories that SageMaker automatically displays to users for cloning in the JupyterLab
     *        application.
     */

    public void setCodeRepositories(java.util.Collection<CodeRepository> codeRepositories) {
        if (codeRepositories == null) {
            this.codeRepositories = null;
            return;
        }

        this.codeRepositories = new java.util.ArrayList<CodeRepository>(codeRepositories);
    }

    /**
     * <p>
     * A list of Git repositories that SageMaker automatically displays to users for cloning in the JupyterLab
     * application.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCodeRepositories(java.util.Collection)} or {@link #withCodeRepositories(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param codeRepositories
     *        A list of Git repositories that SageMaker automatically displays to users for cloning in the JupyterLab
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceJupyterLabAppSettings withCodeRepositories(CodeRepository... codeRepositories) {
        if (this.codeRepositories == null) {
            setCodeRepositories(new java.util.ArrayList<CodeRepository>(codeRepositories.length));
        }
        for (CodeRepository ele : codeRepositories) {
            this.codeRepositories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of Git repositories that SageMaker automatically displays to users for cloning in the JupyterLab
     * application.
     * </p>
     * 
     * @param codeRepositories
     *        A list of Git repositories that SageMaker automatically displays to users for cloning in the JupyterLab
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpaceJupyterLabAppSettings withCodeRepositories(java.util.Collection<CodeRepository> codeRepositories) {
        setCodeRepositories(codeRepositories);
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
        if (getDefaultResourceSpec() != null)
            sb.append("DefaultResourceSpec: ").append(getDefaultResourceSpec()).append(",");
        if (getCodeRepositories() != null)
            sb.append("CodeRepositories: ").append(getCodeRepositories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpaceJupyterLabAppSettings == false)
            return false;
        SpaceJupyterLabAppSettings other = (SpaceJupyterLabAppSettings) obj;
        if (other.getDefaultResourceSpec() == null ^ this.getDefaultResourceSpec() == null)
            return false;
        if (other.getDefaultResourceSpec() != null && other.getDefaultResourceSpec().equals(this.getDefaultResourceSpec()) == false)
            return false;
        if (other.getCodeRepositories() == null ^ this.getCodeRepositories() == null)
            return false;
        if (other.getCodeRepositories() != null && other.getCodeRepositories().equals(this.getCodeRepositories()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDefaultResourceSpec() == null) ? 0 : getDefaultResourceSpec().hashCode());
        hashCode = prime * hashCode + ((getCodeRepositories() == null) ? 0 : getCodeRepositories().hashCode());
        return hashCode;
    }

    @Override
    public SpaceJupyterLabAppSettings clone() {
        try {
            return (SpaceJupyterLabAppSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.SpaceJupyterLabAppSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
