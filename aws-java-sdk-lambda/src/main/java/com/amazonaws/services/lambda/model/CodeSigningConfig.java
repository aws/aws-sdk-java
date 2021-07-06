/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about a <a href="https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html">Code signing
 * configuration</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CodeSigningConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeSigningConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifer for the Code signing configuration.
     * </p>
     */
    private String codeSigningConfigId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Code signing configuration.
     * </p>
     */
    private String codeSigningConfigArn;
    /**
     * <p>
     * Code signing configuration description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * List of allowed publishers.
     * </p>
     */
    private AllowedPublishers allowedPublishers;
    /**
     * <p>
     * The code signing policy controls the validation failure action for signature mismatch or expiry.
     * </p>
     */
    private CodeSigningPolicies codeSigningPolicies;
    /**
     * <p>
     * The date and time that the Code signing configuration was last modified, in ISO-8601 format
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     */
    private String lastModified;

    /**
     * <p>
     * Unique identifer for the Code signing configuration.
     * </p>
     * 
     * @param codeSigningConfigId
     *        Unique identifer for the Code signing configuration.
     */

    public void setCodeSigningConfigId(String codeSigningConfigId) {
        this.codeSigningConfigId = codeSigningConfigId;
    }

    /**
     * <p>
     * Unique identifer for the Code signing configuration.
     * </p>
     * 
     * @return Unique identifer for the Code signing configuration.
     */

    public String getCodeSigningConfigId() {
        return this.codeSigningConfigId;
    }

    /**
     * <p>
     * Unique identifer for the Code signing configuration.
     * </p>
     * 
     * @param codeSigningConfigId
     *        Unique identifer for the Code signing configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSigningConfig withCodeSigningConfigId(String codeSigningConfigId) {
        setCodeSigningConfigId(codeSigningConfigId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Code signing configuration.
     * </p>
     * 
     * @param codeSigningConfigArn
     *        The Amazon Resource Name (ARN) of the Code signing configuration.
     */

    public void setCodeSigningConfigArn(String codeSigningConfigArn) {
        this.codeSigningConfigArn = codeSigningConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Code signing configuration.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Code signing configuration.
     */

    public String getCodeSigningConfigArn() {
        return this.codeSigningConfigArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Code signing configuration.
     * </p>
     * 
     * @param codeSigningConfigArn
     *        The Amazon Resource Name (ARN) of the Code signing configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSigningConfig withCodeSigningConfigArn(String codeSigningConfigArn) {
        setCodeSigningConfigArn(codeSigningConfigArn);
        return this;
    }

    /**
     * <p>
     * Code signing configuration description.
     * </p>
     * 
     * @param description
     *        Code signing configuration description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Code signing configuration description.
     * </p>
     * 
     * @return Code signing configuration description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Code signing configuration description.
     * </p>
     * 
     * @param description
     *        Code signing configuration description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSigningConfig withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * List of allowed publishers.
     * </p>
     * 
     * @param allowedPublishers
     *        List of allowed publishers.
     */

    public void setAllowedPublishers(AllowedPublishers allowedPublishers) {
        this.allowedPublishers = allowedPublishers;
    }

    /**
     * <p>
     * List of allowed publishers.
     * </p>
     * 
     * @return List of allowed publishers.
     */

    public AllowedPublishers getAllowedPublishers() {
        return this.allowedPublishers;
    }

    /**
     * <p>
     * List of allowed publishers.
     * </p>
     * 
     * @param allowedPublishers
     *        List of allowed publishers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSigningConfig withAllowedPublishers(AllowedPublishers allowedPublishers) {
        setAllowedPublishers(allowedPublishers);
        return this;
    }

    /**
     * <p>
     * The code signing policy controls the validation failure action for signature mismatch or expiry.
     * </p>
     * 
     * @param codeSigningPolicies
     *        The code signing policy controls the validation failure action for signature mismatch or expiry.
     */

    public void setCodeSigningPolicies(CodeSigningPolicies codeSigningPolicies) {
        this.codeSigningPolicies = codeSigningPolicies;
    }

    /**
     * <p>
     * The code signing policy controls the validation failure action for signature mismatch or expiry.
     * </p>
     * 
     * @return The code signing policy controls the validation failure action for signature mismatch or expiry.
     */

    public CodeSigningPolicies getCodeSigningPolicies() {
        return this.codeSigningPolicies;
    }

    /**
     * <p>
     * The code signing policy controls the validation failure action for signature mismatch or expiry.
     * </p>
     * 
     * @param codeSigningPolicies
     *        The code signing policy controls the validation failure action for signature mismatch or expiry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSigningConfig withCodeSigningPolicies(CodeSigningPolicies codeSigningPolicies) {
        setCodeSigningPolicies(codeSigningPolicies);
        return this;
    }

    /**
     * <p>
     * The date and time that the Code signing configuration was last modified, in ISO-8601 format
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * 
     * @param lastModified
     *        The date and time that the Code signing configuration was last modified, in ISO-8601 format
     *        (YYYY-MM-DDThh:mm:ss.sTZD).
     */

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time that the Code signing configuration was last modified, in ISO-8601 format
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * 
     * @return The date and time that the Code signing configuration was last modified, in ISO-8601 format
     *         (YYYY-MM-DDThh:mm:ss.sTZD).
     */

    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date and time that the Code signing configuration was last modified, in ISO-8601 format
     * (YYYY-MM-DDThh:mm:ss.sTZD).
     * </p>
     * 
     * @param lastModified
     *        The date and time that the Code signing configuration was last modified, in ISO-8601 format
     *        (YYYY-MM-DDThh:mm:ss.sTZD).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeSigningConfig withLastModified(String lastModified) {
        setLastModified(lastModified);
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
        if (getCodeSigningConfigId() != null)
            sb.append("CodeSigningConfigId: ").append(getCodeSigningConfigId()).append(",");
        if (getCodeSigningConfigArn() != null)
            sb.append("CodeSigningConfigArn: ").append(getCodeSigningConfigArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAllowedPublishers() != null)
            sb.append("AllowedPublishers: ").append(getAllowedPublishers()).append(",");
        if (getCodeSigningPolicies() != null)
            sb.append("CodeSigningPolicies: ").append(getCodeSigningPolicies()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeSigningConfig == false)
            return false;
        CodeSigningConfig other = (CodeSigningConfig) obj;
        if (other.getCodeSigningConfigId() == null ^ this.getCodeSigningConfigId() == null)
            return false;
        if (other.getCodeSigningConfigId() != null && other.getCodeSigningConfigId().equals(this.getCodeSigningConfigId()) == false)
            return false;
        if (other.getCodeSigningConfigArn() == null ^ this.getCodeSigningConfigArn() == null)
            return false;
        if (other.getCodeSigningConfigArn() != null && other.getCodeSigningConfigArn().equals(this.getCodeSigningConfigArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAllowedPublishers() == null ^ this.getAllowedPublishers() == null)
            return false;
        if (other.getAllowedPublishers() != null && other.getAllowedPublishers().equals(this.getAllowedPublishers()) == false)
            return false;
        if (other.getCodeSigningPolicies() == null ^ this.getCodeSigningPolicies() == null)
            return false;
        if (other.getCodeSigningPolicies() != null && other.getCodeSigningPolicies().equals(this.getCodeSigningPolicies()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodeSigningConfigId() == null) ? 0 : getCodeSigningConfigId().hashCode());
        hashCode = prime * hashCode + ((getCodeSigningConfigArn() == null) ? 0 : getCodeSigningConfigArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAllowedPublishers() == null) ? 0 : getAllowedPublishers().hashCode());
        hashCode = prime * hashCode + ((getCodeSigningPolicies() == null) ? 0 : getCodeSigningPolicies().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        return hashCode;
    }

    @Override
    public CodeSigningConfig clone() {
        try {
            return (CodeSigningConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lambda.model.transform.CodeSigningConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
