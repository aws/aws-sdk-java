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
 * The access configuration file to control access to the ML model. You can explicitly accept the model end-user license
 * agreement (EULA) within the <code>ModelAccessConfig</code>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * If you are a Jumpstart user, see the <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/jumpstart-foundation-models-choose.html#jumpstart-foundation-models-choose-eula"
 * >End-user license agreements</a> section for more details on accepting the EULA.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you are an AutoML user, see the <i>Optional Parameters</i> section of <i>Create an AutoML job to fine-tune text
 * generation models using the API</i> for details on <a href=
 * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-create-experiment-finetune-llms.html#autopilot-llms-finetuning-api-optional-params"
 * >How to set the EULA acceptance when fine-tuning a model using the AutoML API</a>.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ModelAccessConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModelAccessConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies agreement to the model end-user license agreement (EULA). The <code>AcceptEula</code> value must be
     * explicitly defined as <code>True</code> in order to accept the EULA that this model requires. You are responsible
     * for reviewing and complying with any applicable license terms and making sure they are acceptable for your use
     * case before downloading or using a model.
     * </p>
     */
    private Boolean acceptEula;

    /**
     * <p>
     * Specifies agreement to the model end-user license agreement (EULA). The <code>AcceptEula</code> value must be
     * explicitly defined as <code>True</code> in order to accept the EULA that this model requires. You are responsible
     * for reviewing and complying with any applicable license terms and making sure they are acceptable for your use
     * case before downloading or using a model.
     * </p>
     * 
     * @param acceptEula
     *        Specifies agreement to the model end-user license agreement (EULA). The <code>AcceptEula</code> value must
     *        be explicitly defined as <code>True</code> in order to accept the EULA that this model requires. You are
     *        responsible for reviewing and complying with any applicable license terms and making sure they are
     *        acceptable for your use case before downloading or using a model.
     */

    public void setAcceptEula(Boolean acceptEula) {
        this.acceptEula = acceptEula;
    }

    /**
     * <p>
     * Specifies agreement to the model end-user license agreement (EULA). The <code>AcceptEula</code> value must be
     * explicitly defined as <code>True</code> in order to accept the EULA that this model requires. You are responsible
     * for reviewing and complying with any applicable license terms and making sure they are acceptable for your use
     * case before downloading or using a model.
     * </p>
     * 
     * @return Specifies agreement to the model end-user license agreement (EULA). The <code>AcceptEula</code> value
     *         must be explicitly defined as <code>True</code> in order to accept the EULA that this model requires. You
     *         are responsible for reviewing and complying with any applicable license terms and making sure they are
     *         acceptable for your use case before downloading or using a model.
     */

    public Boolean getAcceptEula() {
        return this.acceptEula;
    }

    /**
     * <p>
     * Specifies agreement to the model end-user license agreement (EULA). The <code>AcceptEula</code> value must be
     * explicitly defined as <code>True</code> in order to accept the EULA that this model requires. You are responsible
     * for reviewing and complying with any applicable license terms and making sure they are acceptable for your use
     * case before downloading or using a model.
     * </p>
     * 
     * @param acceptEula
     *        Specifies agreement to the model end-user license agreement (EULA). The <code>AcceptEula</code> value must
     *        be explicitly defined as <code>True</code> in order to accept the EULA that this model requires. You are
     *        responsible for reviewing and complying with any applicable license terms and making sure they are
     *        acceptable for your use case before downloading or using a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModelAccessConfig withAcceptEula(Boolean acceptEula) {
        setAcceptEula(acceptEula);
        return this;
    }

    /**
     * <p>
     * Specifies agreement to the model end-user license agreement (EULA). The <code>AcceptEula</code> value must be
     * explicitly defined as <code>True</code> in order to accept the EULA that this model requires. You are responsible
     * for reviewing and complying with any applicable license terms and making sure they are acceptable for your use
     * case before downloading or using a model.
     * </p>
     * 
     * @return Specifies agreement to the model end-user license agreement (EULA). The <code>AcceptEula</code> value
     *         must be explicitly defined as <code>True</code> in order to accept the EULA that this model requires. You
     *         are responsible for reviewing and complying with any applicable license terms and making sure they are
     *         acceptable for your use case before downloading or using a model.
     */

    public Boolean isAcceptEula() {
        return this.acceptEula;
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
        if (getAcceptEula() != null)
            sb.append("AcceptEula: ").append(getAcceptEula());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelAccessConfig == false)
            return false;
        ModelAccessConfig other = (ModelAccessConfig) obj;
        if (other.getAcceptEula() == null ^ this.getAcceptEula() == null)
            return false;
        if (other.getAcceptEula() != null && other.getAcceptEula().equals(this.getAcceptEula()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAcceptEula() == null) ? 0 : getAcceptEula().hashCode());
        return hashCode;
    }

    @Override
    public ModelAccessConfig clone() {
        try {
            return (ModelAccessConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ModelAccessConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
