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
 * Provides information about the access method and settings that are used to retrieve occurrences of sensitive data
 * reported by findings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/RetrievalConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrievalConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The external ID to specify in the trust policy for the IAM role to assume when retrieving sensitive data from
     * affected S3 objects (roleName). This value is null if the value for retrievalMode is CALLER_CREDENTIALS.
     * </p>
     * <p>
     * This ID is a unique alphanumeric string that Amazon Macie generates automatically after you configure it to
     * assume an IAM role. For a Macie administrator to retrieve sensitive data from an affected S3 object for a member
     * account, the trust policy for the role in the member account must include an sts:ExternalId condition that
     * requires this ID.
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * The access method that's used to retrieve sensitive data from affected S3 objects. Valid values are: ASSUME_ROLE,
     * assume an IAM role that is in the affected Amazon Web Services account and delegates access to Amazon Macie
     * (roleName); and, CALLER_CREDENTIALS, use the credentials of the IAM user who requests the sensitive data.
     * </p>
     */
    private String retrievalMode;
    /**
     * <p>
     * The name of the IAM role that is in the affected Amazon Web Services account and Amazon Macie is allowed to
     * assume when retrieving sensitive data from affected S3 objects for the account. This value is null if the value
     * for retrievalMode is CALLER_CREDENTIALS.
     * </p>
     */
    private String roleName;

    /**
     * <p>
     * The external ID to specify in the trust policy for the IAM role to assume when retrieving sensitive data from
     * affected S3 objects (roleName). This value is null if the value for retrievalMode is CALLER_CREDENTIALS.
     * </p>
     * <p>
     * This ID is a unique alphanumeric string that Amazon Macie generates automatically after you configure it to
     * assume an IAM role. For a Macie administrator to retrieve sensitive data from an affected S3 object for a member
     * account, the trust policy for the role in the member account must include an sts:ExternalId condition that
     * requires this ID.
     * </p>
     * 
     * @param externalId
     *        The external ID to specify in the trust policy for the IAM role to assume when retrieving sensitive data
     *        from affected S3 objects (roleName). This value is null if the value for retrievalMode is
     *        CALLER_CREDENTIALS.</p>
     *        <p>
     *        This ID is a unique alphanumeric string that Amazon Macie generates automatically after you configure it
     *        to assume an IAM role. For a Macie administrator to retrieve sensitive data from an affected S3 object for
     *        a member account, the trust policy for the role in the member account must include an sts:ExternalId
     *        condition that requires this ID.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * The external ID to specify in the trust policy for the IAM role to assume when retrieving sensitive data from
     * affected S3 objects (roleName). This value is null if the value for retrievalMode is CALLER_CREDENTIALS.
     * </p>
     * <p>
     * This ID is a unique alphanumeric string that Amazon Macie generates automatically after you configure it to
     * assume an IAM role. For a Macie administrator to retrieve sensitive data from an affected S3 object for a member
     * account, the trust policy for the role in the member account must include an sts:ExternalId condition that
     * requires this ID.
     * </p>
     * 
     * @return The external ID to specify in the trust policy for the IAM role to assume when retrieving sensitive data
     *         from affected S3 objects (roleName). This value is null if the value for retrievalMode is
     *         CALLER_CREDENTIALS.</p>
     *         <p>
     *         This ID is a unique alphanumeric string that Amazon Macie generates automatically after you configure it
     *         to assume an IAM role. For a Macie administrator to retrieve sensitive data from an affected S3 object
     *         for a member account, the trust policy for the role in the member account must include an sts:ExternalId
     *         condition that requires this ID.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * The external ID to specify in the trust policy for the IAM role to assume when retrieving sensitive data from
     * affected S3 objects (roleName). This value is null if the value for retrievalMode is CALLER_CREDENTIALS.
     * </p>
     * <p>
     * This ID is a unique alphanumeric string that Amazon Macie generates automatically after you configure it to
     * assume an IAM role. For a Macie administrator to retrieve sensitive data from an affected S3 object for a member
     * account, the trust policy for the role in the member account must include an sts:ExternalId condition that
     * requires this ID.
     * </p>
     * 
     * @param externalId
     *        The external ID to specify in the trust policy for the IAM role to assume when retrieving sensitive data
     *        from affected S3 objects (roleName). This value is null if the value for retrievalMode is
     *        CALLER_CREDENTIALS.</p>
     *        <p>
     *        This ID is a unique alphanumeric string that Amazon Macie generates automatically after you configure it
     *        to assume an IAM role. For a Macie administrator to retrieve sensitive data from an affected S3 object for
     *        a member account, the trust policy for the role in the member account must include an sts:ExternalId
     *        condition that requires this ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrievalConfiguration withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * The access method that's used to retrieve sensitive data from affected S3 objects. Valid values are: ASSUME_ROLE,
     * assume an IAM role that is in the affected Amazon Web Services account and delegates access to Amazon Macie
     * (roleName); and, CALLER_CREDENTIALS, use the credentials of the IAM user who requests the sensitive data.
     * </p>
     * 
     * @param retrievalMode
     *        The access method that's used to retrieve sensitive data from affected S3 objects. Valid values are:
     *        ASSUME_ROLE, assume an IAM role that is in the affected Amazon Web Services account and delegates access
     *        to Amazon Macie (roleName); and, CALLER_CREDENTIALS, use the credentials of the IAM user who requests the
     *        sensitive data.
     * @see RetrievalMode
     */

    public void setRetrievalMode(String retrievalMode) {
        this.retrievalMode = retrievalMode;
    }

    /**
     * <p>
     * The access method that's used to retrieve sensitive data from affected S3 objects. Valid values are: ASSUME_ROLE,
     * assume an IAM role that is in the affected Amazon Web Services account and delegates access to Amazon Macie
     * (roleName); and, CALLER_CREDENTIALS, use the credentials of the IAM user who requests the sensitive data.
     * </p>
     * 
     * @return The access method that's used to retrieve sensitive data from affected S3 objects. Valid values are:
     *         ASSUME_ROLE, assume an IAM role that is in the affected Amazon Web Services account and delegates access
     *         to Amazon Macie (roleName); and, CALLER_CREDENTIALS, use the credentials of the IAM user who requests the
     *         sensitive data.
     * @see RetrievalMode
     */

    public String getRetrievalMode() {
        return this.retrievalMode;
    }

    /**
     * <p>
     * The access method that's used to retrieve sensitive data from affected S3 objects. Valid values are: ASSUME_ROLE,
     * assume an IAM role that is in the affected Amazon Web Services account and delegates access to Amazon Macie
     * (roleName); and, CALLER_CREDENTIALS, use the credentials of the IAM user who requests the sensitive data.
     * </p>
     * 
     * @param retrievalMode
     *        The access method that's used to retrieve sensitive data from affected S3 objects. Valid values are:
     *        ASSUME_ROLE, assume an IAM role that is in the affected Amazon Web Services account and delegates access
     *        to Amazon Macie (roleName); and, CALLER_CREDENTIALS, use the credentials of the IAM user who requests the
     *        sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrievalMode
     */

    public RetrievalConfiguration withRetrievalMode(String retrievalMode) {
        setRetrievalMode(retrievalMode);
        return this;
    }

    /**
     * <p>
     * The access method that's used to retrieve sensitive data from affected S3 objects. Valid values are: ASSUME_ROLE,
     * assume an IAM role that is in the affected Amazon Web Services account and delegates access to Amazon Macie
     * (roleName); and, CALLER_CREDENTIALS, use the credentials of the IAM user who requests the sensitive data.
     * </p>
     * 
     * @param retrievalMode
     *        The access method that's used to retrieve sensitive data from affected S3 objects. Valid values are:
     *        ASSUME_ROLE, assume an IAM role that is in the affected Amazon Web Services account and delegates access
     *        to Amazon Macie (roleName); and, CALLER_CREDENTIALS, use the credentials of the IAM user who requests the
     *        sensitive data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrievalMode
     */

    public RetrievalConfiguration withRetrievalMode(RetrievalMode retrievalMode) {
        this.retrievalMode = retrievalMode.toString();
        return this;
    }

    /**
     * <p>
     * The name of the IAM role that is in the affected Amazon Web Services account and Amazon Macie is allowed to
     * assume when retrieving sensitive data from affected S3 objects for the account. This value is null if the value
     * for retrievalMode is CALLER_CREDENTIALS.
     * </p>
     * 
     * @param roleName
     *        The name of the IAM role that is in the affected Amazon Web Services account and Amazon Macie is allowed
     *        to assume when retrieving sensitive data from affected S3 objects for the account. This value is null if
     *        the value for retrievalMode is CALLER_CREDENTIALS.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name of the IAM role that is in the affected Amazon Web Services account and Amazon Macie is allowed to
     * assume when retrieving sensitive data from affected S3 objects for the account. This value is null if the value
     * for retrievalMode is CALLER_CREDENTIALS.
     * </p>
     * 
     * @return The name of the IAM role that is in the affected Amazon Web Services account and Amazon Macie is allowed
     *         to assume when retrieving sensitive data from affected S3 objects for the account. This value is null if
     *         the value for retrievalMode is CALLER_CREDENTIALS.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name of the IAM role that is in the affected Amazon Web Services account and Amazon Macie is allowed to
     * assume when retrieving sensitive data from affected S3 objects for the account. This value is null if the value
     * for retrievalMode is CALLER_CREDENTIALS.
     * </p>
     * 
     * @param roleName
     *        The name of the IAM role that is in the affected Amazon Web Services account and Amazon Macie is allowed
     *        to assume when retrieving sensitive data from affected S3 objects for the account. This value is null if
     *        the value for retrievalMode is CALLER_CREDENTIALS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrievalConfiguration withRoleName(String roleName) {
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
        if (getExternalId() != null)
            sb.append("ExternalId: ").append(getExternalId()).append(",");
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

        if (obj instanceof RetrievalConfiguration == false)
            return false;
        RetrievalConfiguration other = (RetrievalConfiguration) obj;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime * hashCode + ((getRetrievalMode() == null) ? 0 : getRetrievalMode().hashCode());
        hashCode = prime * hashCode + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        return hashCode;
    }

    @Override
    public RetrievalConfiguration clone() {
        try {
            return (RetrievalConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.RetrievalConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
