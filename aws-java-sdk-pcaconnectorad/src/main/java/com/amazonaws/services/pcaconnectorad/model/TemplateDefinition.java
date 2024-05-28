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
package com.amazonaws.services.pcaconnectorad.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Template configuration to define the information included in certificates. Define certificate validity and renewal
 * periods, certificate request handling and enrollment options, key usage extensions, application policies, and
 * cryptography settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pca-connector-ad-2018-05-10/TemplateDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TemplateDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     */
    private TemplateV2 templateV2;
    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     */
    private TemplateV3 templateV3;
    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     */
    private TemplateV4 templateV4;

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     * 
     * @param templateV2
     *        Template configuration to define the information included in certificates. Define certificate validity and
     *        renewal periods, certificate request handling and enrollment options, key usage extensions, application
     *        policies, and cryptography settings.
     */

    public void setTemplateV2(TemplateV2 templateV2) {
        this.templateV2 = templateV2;
    }

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     * 
     * @return Template configuration to define the information included in certificates. Define certificate validity
     *         and renewal periods, certificate request handling and enrollment options, key usage extensions,
     *         application policies, and cryptography settings.
     */

    public TemplateV2 getTemplateV2() {
        return this.templateV2;
    }

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     * 
     * @param templateV2
     *        Template configuration to define the information included in certificates. Define certificate validity and
     *        renewal periods, certificate request handling and enrollment options, key usage extensions, application
     *        policies, and cryptography settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateDefinition withTemplateV2(TemplateV2 templateV2) {
        setTemplateV2(templateV2);
        return this;
    }

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     * 
     * @param templateV3
     *        Template configuration to define the information included in certificates. Define certificate validity and
     *        renewal periods, certificate request handling and enrollment options, key usage extensions, application
     *        policies, and cryptography settings.
     */

    public void setTemplateV3(TemplateV3 templateV3) {
        this.templateV3 = templateV3;
    }

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     * 
     * @return Template configuration to define the information included in certificates. Define certificate validity
     *         and renewal periods, certificate request handling and enrollment options, key usage extensions,
     *         application policies, and cryptography settings.
     */

    public TemplateV3 getTemplateV3() {
        return this.templateV3;
    }

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     * 
     * @param templateV3
     *        Template configuration to define the information included in certificates. Define certificate validity and
     *        renewal periods, certificate request handling and enrollment options, key usage extensions, application
     *        policies, and cryptography settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateDefinition withTemplateV3(TemplateV3 templateV3) {
        setTemplateV3(templateV3);
        return this;
    }

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     * 
     * @param templateV4
     *        Template configuration to define the information included in certificates. Define certificate validity and
     *        renewal periods, certificate request handling and enrollment options, key usage extensions, application
     *        policies, and cryptography settings.
     */

    public void setTemplateV4(TemplateV4 templateV4) {
        this.templateV4 = templateV4;
    }

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     * 
     * @return Template configuration to define the information included in certificates. Define certificate validity
     *         and renewal periods, certificate request handling and enrollment options, key usage extensions,
     *         application policies, and cryptography settings.
     */

    public TemplateV4 getTemplateV4() {
        return this.templateV4;
    }

    /**
     * <p>
     * Template configuration to define the information included in certificates. Define certificate validity and
     * renewal periods, certificate request handling and enrollment options, key usage extensions, application policies,
     * and cryptography settings.
     * </p>
     * 
     * @param templateV4
     *        Template configuration to define the information included in certificates. Define certificate validity and
     *        renewal periods, certificate request handling and enrollment options, key usage extensions, application
     *        policies, and cryptography settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TemplateDefinition withTemplateV4(TemplateV4 templateV4) {
        setTemplateV4(templateV4);
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
        if (getTemplateV2() != null)
            sb.append("TemplateV2: ").append(getTemplateV2()).append(",");
        if (getTemplateV3() != null)
            sb.append("TemplateV3: ").append(getTemplateV3()).append(",");
        if (getTemplateV4() != null)
            sb.append("TemplateV4: ").append(getTemplateV4());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TemplateDefinition == false)
            return false;
        TemplateDefinition other = (TemplateDefinition) obj;
        if (other.getTemplateV2() == null ^ this.getTemplateV2() == null)
            return false;
        if (other.getTemplateV2() != null && other.getTemplateV2().equals(this.getTemplateV2()) == false)
            return false;
        if (other.getTemplateV3() == null ^ this.getTemplateV3() == null)
            return false;
        if (other.getTemplateV3() != null && other.getTemplateV3().equals(this.getTemplateV3()) == false)
            return false;
        if (other.getTemplateV4() == null ^ this.getTemplateV4() == null)
            return false;
        if (other.getTemplateV4() != null && other.getTemplateV4().equals(this.getTemplateV4()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTemplateV2() == null) ? 0 : getTemplateV2().hashCode());
        hashCode = prime * hashCode + ((getTemplateV3() == null) ? 0 : getTemplateV3().hashCode());
        hashCode = prime * hashCode + ((getTemplateV4() == null) ? 0 : getTemplateV4().hashCode());
        return hashCode;
    }

    @Override
    public TemplateDefinition clone() {
        try {
            return (TemplateDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pcaconnectorad.model.transform.TemplateDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
