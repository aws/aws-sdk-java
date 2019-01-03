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
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Attributes that define a secret resource, which references a secret from AWS Secrets Manager. AWS IoT Greengrass
 * stores a local, encrypted copy of the secret on the Greengrass core, where it can be securely accessed by connectors
 * and Lambda functions.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/SecretsManagerSecretResourceData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SecretsManagerSecretResourceData implements Serializable, Cloneable, StructuredPojo {

    /**
     * The ARN of the Secrets Manager secret to make available on the core. The value of the secret's latest version
     * (represented by the ''AWSCURRENT'' staging label) is included by default.
     */
    private String aRN;
    /** Optional. The staging labels whose values you want to make available on the core, in addition to ''AWSCURRENT''. */
    private java.util.List<String> additionalStagingLabelsToDownload;

    /**
     * The ARN of the Secrets Manager secret to make available on the core. The value of the secret's latest version
     * (represented by the ''AWSCURRENT'' staging label) is included by default.
     * 
     * @param aRN
     *        The ARN of the Secrets Manager secret to make available on the core. The value of the secret's latest
     *        version (represented by the ''AWSCURRENT'' staging label) is included by default.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * The ARN of the Secrets Manager secret to make available on the core. The value of the secret's latest version
     * (represented by the ''AWSCURRENT'' staging label) is included by default.
     * 
     * @return The ARN of the Secrets Manager secret to make available on the core. The value of the secret's latest
     *         version (represented by the ''AWSCURRENT'' staging label) is included by default.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * The ARN of the Secrets Manager secret to make available on the core. The value of the secret's latest version
     * (represented by the ''AWSCURRENT'' staging label) is included by default.
     * 
     * @param aRN
     *        The ARN of the Secrets Manager secret to make available on the core. The value of the secret's latest
     *        version (represented by the ''AWSCURRENT'' staging label) is included by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretsManagerSecretResourceData withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * Optional. The staging labels whose values you want to make available on the core, in addition to ''AWSCURRENT''.
     * 
     * @return Optional. The staging labels whose values you want to make available on the core, in addition to
     *         ''AWSCURRENT''.
     */

    public java.util.List<String> getAdditionalStagingLabelsToDownload() {
        return additionalStagingLabelsToDownload;
    }

    /**
     * Optional. The staging labels whose values you want to make available on the core, in addition to ''AWSCURRENT''.
     * 
     * @param additionalStagingLabelsToDownload
     *        Optional. The staging labels whose values you want to make available on the core, in addition to
     *        ''AWSCURRENT''.
     */

    public void setAdditionalStagingLabelsToDownload(java.util.Collection<String> additionalStagingLabelsToDownload) {
        if (additionalStagingLabelsToDownload == null) {
            this.additionalStagingLabelsToDownload = null;
            return;
        }

        this.additionalStagingLabelsToDownload = new java.util.ArrayList<String>(additionalStagingLabelsToDownload);
    }

    /**
     * Optional. The staging labels whose values you want to make available on the core, in addition to ''AWSCURRENT''.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalStagingLabelsToDownload(java.util.Collection)} or
     * {@link #withAdditionalStagingLabelsToDownload(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param additionalStagingLabelsToDownload
     *        Optional. The staging labels whose values you want to make available on the core, in addition to
     *        ''AWSCURRENT''.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretsManagerSecretResourceData withAdditionalStagingLabelsToDownload(String... additionalStagingLabelsToDownload) {
        if (this.additionalStagingLabelsToDownload == null) {
            setAdditionalStagingLabelsToDownload(new java.util.ArrayList<String>(additionalStagingLabelsToDownload.length));
        }
        for (String ele : additionalStagingLabelsToDownload) {
            this.additionalStagingLabelsToDownload.add(ele);
        }
        return this;
    }

    /**
     * Optional. The staging labels whose values you want to make available on the core, in addition to ''AWSCURRENT''.
     * 
     * @param additionalStagingLabelsToDownload
     *        Optional. The staging labels whose values you want to make available on the core, in addition to
     *        ''AWSCURRENT''.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SecretsManagerSecretResourceData withAdditionalStagingLabelsToDownload(java.util.Collection<String> additionalStagingLabelsToDownload) {
        setAdditionalStagingLabelsToDownload(additionalStagingLabelsToDownload);
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
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getAdditionalStagingLabelsToDownload() != null)
            sb.append("AdditionalStagingLabelsToDownload: ").append(getAdditionalStagingLabelsToDownload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SecretsManagerSecretResourceData == false)
            return false;
        SecretsManagerSecretResourceData other = (SecretsManagerSecretResourceData) obj;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getAdditionalStagingLabelsToDownload() == null ^ this.getAdditionalStagingLabelsToDownload() == null)
            return false;
        if (other.getAdditionalStagingLabelsToDownload() != null
                && other.getAdditionalStagingLabelsToDownload().equals(this.getAdditionalStagingLabelsToDownload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getAdditionalStagingLabelsToDownload() == null) ? 0 : getAdditionalStagingLabelsToDownload().hashCode());
        return hashCode;
    }

    @Override
    public SecretsManagerSecretResourceData clone() {
        try {
            return (SecretsManagerSecretResourceData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.SecretsManagerSecretResourceDataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
