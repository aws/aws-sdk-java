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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the access method and settings to use when retrieving occurrences of sensitive data reported by findings.
 * If your request specifies an Identity and Access Management (IAM) role to assume, Amazon Macie verifies that the role
 * exists and the attached policies are configured correctly. If there's an issue, Macie returns an error. For
 * information about addressing the issue, see <a
 * href="https://docs.aws.amazon.com/macie/latest/user/findings-retrieve-sd-options.html">Configuration options and
 * requirements for retrieving sensitive data samples</a> in the <i>Amazon Macie User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UpdateRetrievalConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRetrievalConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The access method to use when retrieving sensitive data from affected S3 objects. Valid values are: ASSUME_ROLE,
     * assume an IAM role that is in the affected Amazon Web Services account and delegates access to Amazon Macie; and,
     * CALLER_CREDENTIALS, use the credentials of the IAM user who requests the sensitive data. If you specify
     * ASSUME_ROLE, also specify the name of an existing IAM role for Macie to assume (roleName).
     * </p>
     * <important>
     * <p>
     * If you change this value from ASSUME_ROLE to CALLER_CREDENTIALS for an existing configuration, Macie permanently
     * deletes the external ID and role name currently specified for the configuration. These settings can't be
     * recovered after they're deleted.
     * </p>
     * </important>
     */
    private String retrievalMode;
    /**
     * <p>
     * The name of the IAM role that is in the affected Amazon Web Services account and Amazon Macie is allowed to
     * assume when retrieving sensitive data from affected S3 objects for the account. The trust and permissions
     * policies for the role must meet all requirements for Macie to assume the role.
     * </p>
     */
    private String roleName;

    /**
     * <p>
     * The access method to use when retrieving sensitive data from affected S3 objects. Valid values are: ASSUME_ROLE,
     * assume an IAM role that is in the affected Amazon Web Services account and delegates access to Amazon Macie; and,
     * CALLER_CREDENTIALS, use the credentials of the IAM user who requests the sensitive data. If you specify
     * ASSUME_ROLE, also specify the name of an existing IAM role for Macie to assume (roleName).
     * </p>
     * <important>
     * <p>
     * If you change this value from ASSUME_ROLE to CALLER_CREDENTIALS for an existing configuration, Macie permanently
     * deletes the external ID and role name currently specified for the configuration. These settings can't be
     * recovered after they're deleted.
     * </p>
     * </important>
     * 
     * @param retrievalMode
     *        The access method to use when retrieving sensitive data from affected S3 objects. Valid values are:
     *        ASSUME_ROLE, assume an IAM role that is in the affected Amazon Web Services account and delegates access
     *        to Amazon Macie; and, CALLER_CREDENTIALS, use the credentials of the IAM user who requests the sensitive
     *        data. If you specify ASSUME_ROLE, also specify the name of an existing IAM role for Macie to assume
     *        (roleName).</p> <important>
     *        <p>
     *        If you change this value from ASSUME_ROLE to CALLER_CREDENTIALS for an existing configuration, Macie
     *        permanently deletes the external ID and role name currently specified for the configuration. These
     *        settings can't be recovered after they're deleted.
     *        </p>
     * @see RetrievalMode
     */

    public void setRetrievalMode(String retrievalMode) {
        this.retrievalMode = retrievalMode;
    }

    /**
     * <p>
     * The access method to use when retrieving sensitive data from affected S3 objects. Valid values are: ASSUME_ROLE,
     * assume an IAM role that is in the affected Amazon Web Services account and delegates access to Amazon Macie; and,
     * CALLER_CREDENTIALS, use the credentials of the IAM user who requests the sensitive data. If you specify
     * ASSUME_ROLE, also specify the name of an existing IAM role for Macie to assume (roleName).
     * </p>
     * <important>
     * <p>
     * If you change this value from ASSUME_ROLE to CALLER_CREDENTIALS for an existing configuration, Macie permanently
     * deletes the external ID and role name currently specified for the configuration. These settings can't be
     * recovered after they're deleted.
     * </p>
     * </important>
     * 
     * @return The access method to use when retrieving sensitive data from affected S3 objects. Valid values are:
     *         ASSUME_ROLE, assume an IAM role that is in the affected Amazon Web Services account and delegates access
     *         to Amazon Macie; and, CALLER_CREDENTIALS, use the credentials of the IAM user who requests the sensitive
     *         data. If you specify ASSUME_ROLE, also specify the name of an existing IAM role for Macie to assume
     *         (roleName).</p> <important>
     *         <p>
     *         If you change this value from ASSUME_ROLE to CALLER_CREDENTIALS for an existing configuration, Macie
     *         permanently deletes the external ID and role name currently specified for the configuration. These
     *         settings can't be recovered after they're deleted.
     *         </p>
     * @see RetrievalMode
     */

    public String getRetrievalMode() {
        return this.retrievalMode;
    }

    /**
     * <p>
     * The access method to use when retrieving sensitive data from affected S3 objects. Valid values are: ASSUME_ROLE,
     * assume an IAM role that is in the affected Amazon Web Services account and delegates access to Amazon Macie; and,
     * CALLER_CREDENTIALS, use the credentials of the IAM user who requests the sensitive data. If you specify
     * ASSUME_ROLE, also specify the name of an existing IAM role for Macie to assume (roleName).
     * </p>
     * <important>
     * <p>
     * If you change this value from ASSUME_ROLE to CALLER_CREDENTIALS for an existing configuration, Macie permanently
     * deletes the external ID and role name currently specified for the configuration. These settings can't be
     * recovered after they're deleted.
     * </p>
     * </important>
     * 
     * @param retrievalMode
     *        The access method to use when retrieving sensitive data from affected S3 objects. Valid values are:
     *        ASSUME_ROLE, assume an IAM role that is in the affected Amazon Web Services account and delegates access
     *        to Amazon Macie; and, CALLER_CREDENTIALS, use the credentials of the IAM user who requests the sensitive
     *        data. If you specify ASSUME_ROLE, also specify the name of an existing IAM role for Macie to assume
     *        (roleName).</p> <important>
     *        <p>
     *        If you change this value from ASSUME_ROLE to CALLER_CREDENTIALS for an existing configuration, Macie
     *        permanently deletes the external ID and role name currently specified for the configuration. These
     *        settings can't be recovered after they're deleted.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrievalMode
     */

    public UpdateRetrievalConfiguration withRetrievalMode(String retrievalMode) {
        setRetrievalMode(retrievalMode);
        return this;
    }

    /**
     * <p>
     * The access method to use when retrieving sensitive data from affected S3 objects. Valid values are: ASSUME_ROLE,
     * assume an IAM role that is in the affected Amazon Web Services account and delegates access to Amazon Macie; and,
     * CALLER_CREDENTIALS, use the credentials of the IAM user who requests the sensitive data. If you specify
     * ASSUME_ROLE, also specify the name of an existing IAM role for Macie to assume (roleName).
     * </p>
     * <important>
     * <p>
     * If you change this value from ASSUME_ROLE to CALLER_CREDENTIALS for an existing configuration, Macie permanently
     * deletes the external ID and role name currently specified for the configuration. These settings can't be
     * recovered after they're deleted.
     * </p>
     * </important>
     * 
     * @param retrievalMode
     *        The access method to use when retrieving sensitive data from affected S3 objects. Valid values are:
     *        ASSUME_ROLE, assume an IAM role that is in the affected Amazon Web Services account and delegates access
     *        to Amazon Macie; and, CALLER_CREDENTIALS, use the credentials of the IAM user who requests the sensitive
     *        data. If you specify ASSUME_ROLE, also specify the name of an existing IAM role for Macie to assume
     *        (roleName).</p> <important>
     *        <p>
     *        If you change this value from ASSUME_ROLE to CALLER_CREDENTIALS for an existing configuration, Macie
     *        permanently deletes the external ID and role name currently specified for the configuration. These
     *        settings can't be recovered after they're deleted.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrievalMode
     */

    public UpdateRetrievalConfiguration withRetrievalMode(RetrievalMode retrievalMode) {
        this.retrievalMode = retrievalMode.toString();
        return this;
    }

    /**
     * <p>
     * The name of the IAM role that is in the affected Amazon Web Services account and Amazon Macie is allowed to
     * assume when retrieving sensitive data from affected S3 objects for the account. The trust and permissions
     * policies for the role must meet all requirements for Macie to assume the role.
     * </p>
     * 
     * @param roleName
     *        The name of the IAM role that is in the affected Amazon Web Services account and Amazon Macie is allowed
     *        to assume when retrieving sensitive data from affected S3 objects for the account. The trust and
     *        permissions policies for the role must meet all requirements for Macie to assume the role.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the IAM role that is in the affected Amazon Web Services account and Amazon Macie is allowed to
     * assume when retrieving sensitive data from affected S3 objects for the account. The trust and permissions
     * policies for the role must meet all requirements for Macie to assume the role.
     * </p>
     * 
     * @return The name of the IAM role that is in the affected Amazon Web Services account and Amazon Macie is allowed
     *         to assume when retrieving sensitive data from affected S3 objects for the account. The trust and
     *         permissions policies for the role must meet all requirements for Macie to assume the role.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the IAM role that is in the affected Amazon Web Services account and Amazon Macie is allowed to
     * assume when retrieving sensitive data from affected S3 objects for the account. The trust and permissions
     * policies for the role must meet all requirements for Macie to assume the role.
     * </p>
     * 
     * @param roleName
     *        The name of the IAM role that is in the affected Amazon Web Services account and Amazon Macie is allowed
     *        to assume when retrieving sensitive data from affected S3 objects for the account. The trust and
     *        permissions policies for the role must meet all requirements for Macie to assume the role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRetrievalConfiguration withRoleName(String roleName) {
        setRoleName(roleName);
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
        if (getRetrievalMode() != null)
            sb.append("RetrievalMode: ").append(getRetrievalMode()).append(",");
        if (getRoleName() != null)
            sb.append("RoleName: ").append(getRoleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRetrievalConfiguration == false)
            return false;
        UpdateRetrievalConfiguration other = (UpdateRetrievalConfiguration) obj;
        if (other.getRetrievalMode() == null ^ this.getRetrievalMode() == null)
            return false;
        if (other.getRetrievalMode() != null && other.getRetrievalMode().equals(this.getRetrievalMode()) == false)
            return false;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRetrievalMode() == null) ? 0 : getRetrievalMode().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRetrievalConfiguration clone() {
        try {
            return (UpdateRetrievalConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.UpdateRetrievalConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
