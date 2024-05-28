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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An array of configuration policy associations, one for each configuration policy association identifier, that was
 * specified in a <code>BatchGetConfigurationPolicyAssociations</code> request but couldn’t be processed due to an
 * error.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UnprocessedConfigurationPolicyAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnprocessedConfigurationPolicyAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Configuration policy association identifiers that were specified in a
     * <code>BatchGetConfigurationPolicyAssociations</code> request but couldn’t be processed due to an error.
     * </p>
     */
    private ConfigurationPolicyAssociation configurationPolicyAssociationIdentifiers;
    /**
     * <p>
     * An HTTP status code that identifies why the configuration policy association failed.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * A string that identifies why the configuration policy association failed.
     * </p>
     */
    private String errorReason;

    /**
     * <p>
     * Configuration policy association identifiers that were specified in a
     * <code>BatchGetConfigurationPolicyAssociations</code> request but couldn’t be processed due to an error.
     * </p>
     * 
     * @param configurationPolicyAssociationIdentifiers
     *        Configuration policy association identifiers that were specified in a
     *        <code>BatchGetConfigurationPolicyAssociations</code> request but couldn’t be processed due to an error.
     */

    public void setConfigurationPolicyAssociationIdentifiers(ConfigurationPolicyAssociation configurationPolicyAssociationIdentifiers) {
        this.configurationPolicyAssociationIdentifiers = configurationPolicyAssociationIdentifiers;
    }

    /**
     * <p>
     * Configuration policy association identifiers that were specified in a
     * <code>BatchGetConfigurationPolicyAssociations</code> request but couldn’t be processed due to an error.
     * </p>
     * 
     * @return Configuration policy association identifiers that were specified in a
     *         <code>BatchGetConfigurationPolicyAssociations</code> request but couldn’t be processed due to an error.
     */

    public ConfigurationPolicyAssociation getConfigurationPolicyAssociationIdentifiers() {
        return this.configurationPolicyAssociationIdentifiers;
    }

    /**
     * <p>
     * Configuration policy association identifiers that were specified in a
     * <code>BatchGetConfigurationPolicyAssociations</code> request but couldn’t be processed due to an error.
     * </p>
     * 
     * @param configurationPolicyAssociationIdentifiers
     *        Configuration policy association identifiers that were specified in a
     *        <code>BatchGetConfigurationPolicyAssociations</code> request but couldn’t be processed due to an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedConfigurationPolicyAssociation withConfigurationPolicyAssociationIdentifiers(
            ConfigurationPolicyAssociation configurationPolicyAssociationIdentifiers) {
        setConfigurationPolicyAssociationIdentifiers(configurationPolicyAssociationIdentifiers);
        return this;
    }

    /**
     * <p>
     * An HTTP status code that identifies why the configuration policy association failed.
     * </p>
     * 
     * @param errorCode
     *        An HTTP status code that identifies why the configuration policy association failed.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * An HTTP status code that identifies why the configuration policy association failed.
     * </p>
     * 
     * @return An HTTP status code that identifies why the configuration policy association failed.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * An HTTP status code that identifies why the configuration policy association failed.
     * </p>
     * 
     * @param errorCode
     *        An HTTP status code that identifies why the configuration policy association failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedConfigurationPolicyAssociation withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * A string that identifies why the configuration policy association failed.
     * </p>
     * 
     * @param errorReason
     *        A string that identifies why the configuration policy association failed.
     */

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    /**
     * <p>
     * A string that identifies why the configuration policy association failed.
     * </p>
     * 
     * @return A string that identifies why the configuration policy association failed.
     */

    public String getErrorReason() {
        return this.errorReason;
    }

    /**
     * <p>
     * A string that identifies why the configuration policy association failed.
     * </p>
     * 
     * @param errorReason
     *        A string that identifies why the configuration policy association failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnprocessedConfigurationPolicyAssociation withErrorReason(String errorReason) {
        setErrorReason(errorReason);
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
        if (getConfigurationPolicyAssociationIdentifiers() != null)
            sb.append("ConfigurationPolicyAssociationIdentifiers: ").append(getConfigurationPolicyAssociationIdentifiers()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorReason() != null)
            sb.append("ErrorReason: ").append(getErrorReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnprocessedConfigurationPolicyAssociation == false)
            return false;
        UnprocessedConfigurationPolicyAssociation other = (UnprocessedConfigurationPolicyAssociation) obj;
        if (other.getConfigurationPolicyAssociationIdentifiers() == null ^ this.getConfigurationPolicyAssociationIdentifiers() == null)
            return false;
        if (other.getConfigurationPolicyAssociationIdentifiers() != null
                && other.getConfigurationPolicyAssociationIdentifiers().equals(this.getConfigurationPolicyAssociationIdentifiers()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorReason() == null ^ this.getErrorReason() == null)
            return false;
        if (other.getErrorReason() != null && other.getErrorReason().equals(this.getErrorReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfigurationPolicyAssociationIdentifiers() == null) ? 0 : getConfigurationPolicyAssociationIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorReason() == null) ? 0 : getErrorReason().hashCode());
        return hashCode;
    }

    @Override
    public UnprocessedConfigurationPolicyAssociation clone() {
        try {
            return (UnprocessedConfigurationPolicyAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.UnprocessedConfigurationPolicyAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
