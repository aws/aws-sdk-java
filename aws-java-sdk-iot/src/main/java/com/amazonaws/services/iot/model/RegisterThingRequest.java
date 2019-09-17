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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterThingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The provisioning template. See <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/programmatic-provisioning.html">Programmatic
     * Provisioning</a> for more information.
     * </p>
     */
    private String templateBody;
    /**
     * <p>
     * The parameters for provisioning a thing. See <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/programmatic-provisioning.html">Programmatic
     * Provisioning</a> for more information.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The provisioning template. See <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/programmatic-provisioning.html">Programmatic
     * Provisioning</a> for more information.
     * </p>
     * 
     * @param templateBody
     *        The provisioning template. See <a
     *        href="https://docs.aws.amazon.com/iot/latest/developerguide/programmatic-provisioning.html">Programmatic
     *        Provisioning</a> for more information.
     */

    public void setTemplateBody(String templateBody) {
        this.templateBody = templateBody;
    }

    /**
     * <p>
     * The provisioning template. See <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/programmatic-provisioning.html">Programmatic
     * Provisioning</a> for more information.
     * </p>
     * 
     * @return The provisioning template. See <a
     *         href="https://docs.aws.amazon.com/iot/latest/developerguide/programmatic-provisioning.html">Programmatic
     *         Provisioning</a> for more information.
     */

    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * <p>
     * The provisioning template. See <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/programmatic-provisioning.html">Programmatic
     * Provisioning</a> for more information.
     * </p>
     * 
     * @param templateBody
     *        The provisioning template. See <a
     *        href="https://docs.aws.amazon.com/iot/latest/developerguide/programmatic-provisioning.html">Programmatic
     *        Provisioning</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterThingRequest withTemplateBody(String templateBody) {
        setTemplateBody(templateBody);
        return this;
    }

    /**
     * <p>
     * The parameters for provisioning a thing. See <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/programmatic-provisioning.html">Programmatic
     * Provisioning</a> for more information.
     * </p>
     * 
     * @return The parameters for provisioning a thing. See <a
     *         href="https://docs.aws.amazon.com/iot/latest/developerguide/programmatic-provisioning.html">Programmatic
     *         Provisioning</a> for more information.
     */

    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * The parameters for provisioning a thing. See <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/programmatic-provisioning.html">Programmatic
     * Provisioning</a> for more information.
     * </p>
     * 
     * @param parameters
     *        The parameters for provisioning a thing. See <a
     *        href="https://docs.aws.amazon.com/iot/latest/developerguide/programmatic-provisioning.html">Programmatic
     *        Provisioning</a> for more information.
     */

    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * The parameters for provisioning a thing. See <a
     * href="https://docs.aws.amazon.com/iot/latest/developerguide/programmatic-provisioning.html">Programmatic
     * Provisioning</a> for more information.
     * </p>
     * 
     * @param parameters
     *        The parameters for provisioning a thing. See <a
     *        href="https://docs.aws.amazon.com/iot/latest/developerguide/programmatic-provisioning.html">Programmatic
     *        Provisioning</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterThingRequest withParameters(java.util.Map<String, String> parameters) {
        setParameters(parameters);
        return this;
    }

    public RegisterThingRequest addParametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Parameters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterThingRequest clearParametersEntries() {
        this.parameters = null;
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
        if (getTemplateBody() != null)
            sb.append("TemplateBody: ").append(getTemplateBody()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterThingRequest == false)
            return false;
        RegisterThingRequest other = (RegisterThingRequest) obj;
        if (other.getTemplateBody() == null ^ this.getTemplateBody() == null)
            return false;
        if (other.getTemplateBody() != null && other.getTemplateBody().equals(this.getTemplateBody()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateBody() == null) ? 0 : getTemplateBody().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public RegisterThingRequest clone() {
        return (RegisterThingRequest) super.clone();
    }

}
